package my.com.lcsb.korok.features.speciesInfo;

import java.text.MessageFormat;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SpeciesInfoService {
    final private SpeciesInfoRepository speciesInfoRepository;

    public SpeciesInfo save(SpeciesInfo enterpriseInfo) {
        return speciesInfoRepository.save(enterpriseInfo);
    }

     public Optional<SpeciesInfo> findById(String code) {
        return speciesInfoRepository.findById(code);
    }

    // delete soil
    public void delete(String code) {
        speciesInfoRepository.deleteById(code);
    }

    public Page<SpeciesInfo> findAll(String filter, Pageable pageable) {
        Specification<SpeciesInfo> spec = getSpec(filter);
        return speciesInfoRepository.findAll(spec, pageable);
    }

    private static Specification<SpeciesInfo> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<SpeciesInfo> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("code"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<SpeciesInfo> specname = (root, query, cb) -> cb.like(cb.lower(root.get("type")), filterPattern);
        Specification<SpeciesInfo> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("descp")), filterPattern);

        return Specification.where(specid).or(specname).or(specremark);
    }
}
