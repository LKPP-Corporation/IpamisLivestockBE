package my.com.lcsb.korok.features.ceLivestockstatus;

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
public class CeLivestockstatusService {
     final private CeLivestockstatusRepository ceLivestockstatusRepository;

     public CeLivestockstatus save(CeLivestockstatus ceLivestockstatus) {
        return ceLivestockstatusRepository.save(ceLivestockstatus);
    }

     public Optional<CeLivestockstatus> findById(Long id) {
        return ceLivestockstatusRepository.findById(id);
    }

    //  public Optional<CeLivestockstatus> findByRegId(String regid) {
    //     return ceLivestockstatusRepository.findByRegid(regid);
    // }    

    // delete soil
    public void delete(Long id) {
        ceLivestockstatusRepository.deleteById(id);
    }

    public Page<CeLivestockstatus> findAll(String filter, Pageable pageable) {
        Specification<CeLivestockstatus> spec = getSpec(filter);
        return ceLivestockstatusRepository.findAll(spec, pageable);
    }

    private static Specification<CeLivestockstatus> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<CeLivestockstatus> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("regid"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<CeLivestockstatus> specname = (root, query, cb) -> cb.like(cb.lower(root.get("currstatus")), filterPattern);
        //Specification<Soil> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("remark")), filterPattern);

        //return Specification.where(specid).or(specname).or(specremark);
        return Specification.where(specid).or(specname);
    }
}
