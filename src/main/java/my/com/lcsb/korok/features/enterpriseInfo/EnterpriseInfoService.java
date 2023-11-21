package my.com.lcsb.korok.features.enterpriseInfo;

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
public class EnterpriseInfoService {

   

    final private EnterpriseInfoRepository enterpriseInfoRepository;

    public EnterpriseInfo save(EnterpriseInfo enterpriseInfo) {
        return enterpriseInfoRepository.save(enterpriseInfo);
    }

     public Optional<EnterpriseInfo> findById(String code) {
        return enterpriseInfoRepository.findById(code);
    }

    public Optional<EnterpriseInfo> findByEnterpriseCode(String entercode) {
        return enterpriseInfoRepository.findById(entercode);
    }

    // delete soil
    public void delete(String code) {
        enterpriseInfoRepository.deleteById(code);
    }

    public Page<EnterpriseInfo> findAll(String filter, Pageable pageable) {
        Specification<EnterpriseInfo> spec = getSpec(filter);
        return enterpriseInfoRepository.findAll(spec, pageable);
    }

    private static Specification<EnterpriseInfo> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<EnterpriseInfo> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("code"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<EnterpriseInfo> specname = (root, query, cb) -> cb.like(cb.lower(root.get("type")), filterPattern);
        Specification<EnterpriseInfo> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("descp")), filterPattern);
        Specification<EnterpriseInfo> spectype = (root, query, cb) -> cb.like(cb.lower(root.get("type")), filterPattern);

        return Specification.where(specid).or(specname).or(specremark).or(spectype);
    }

    
}
