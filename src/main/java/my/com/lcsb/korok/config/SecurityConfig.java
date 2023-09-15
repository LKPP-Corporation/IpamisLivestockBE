package my.com.lcsb.korok.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import static org.springframework.security.config.Customizer.withDefaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.com.lcsb.korok.config.user.User;
import my.com.lcsb.korok.config.user.UserService;

@Slf4j
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {

    @Value("#{'${domains.allow}'.split(',')}")
    private List<String> domainList;

    final private UserService userService;

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // http.securityMatcher(EndpointRequest.toAnyEndpoint());
        http.cors(withDefaults())
                .authorizeHttpRequests(requests -> requests
                        .antMatchers("/error").permitAll()
                        .antMatchers("/logout").permitAll()

                        // .antMatchers("/actuator").permitAll()
                        .antMatchers("/actuator/prometheus").permitAll()
                        .antMatchers("/actuator/**").permitAll()
                        // .antMatchers("/instances").permitAll()
                        .antMatchers("/instances/**").permitAll()

                        .anyRequest()
                        .authenticated())
                .oauth2ResourceServer(server -> server
                        .jwt()
                        .jwtAuthenticationConverter(jwtAuthenticationConverter()));

        return http.build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(domainList);
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS",
                "HEAD", "DELETE"));
        configuration.setAllowCredentials(true);
        configuration
                .setAllowedHeaders(Arrays.asList("*"));
        configuration.setExposedHeaders(Arrays.asList("X-Get-Header",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Methods", "Access-Control-Allow-Headers",
                "Access-Control-Max-Age"));
        configuration.setMaxAge(3600L);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    JwtAuthenticationConverter jwtAuthenticationConverter() {
        final JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new UserRoleConverter());

        return jwtAuthenticationConverter;
    }

    public class UserRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

        @Override
        public Collection<GrantedAuthority> convert(final Jwt jwt) {
            // Map<String, String> userRoles = Map.of("admin", "ADMIN", "user", "USER");

            List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();

            String subject = jwt.getSubject();
            String email = jwt.getClaimAsString("email");
            // String role = "USER";
            log.debug("subject {} , email {}", subject, email);
            Optional<User> user = userService.findByEmail(email);

            // simpleGrantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

            if (user.isPresent()) {
                user.get().getRoles().forEach(role -> {
                    simpleGrantedAuthorities.add(new SimpleGrantedAuthority("ROLE_".concat(role)));
                });
            } else
                simpleGrantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

            log.debug("sga {}", simpleGrantedAuthorities);
            return new ArrayList<>(simpleGrantedAuthorities);
        }
    }
}
