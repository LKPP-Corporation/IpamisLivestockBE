package my.com.lcsb.korok.features.ceLivestock;

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
public class CeLivestockService {

   

    final private CeLivestockRepository ceLivestockRepository;

    public CeLivestock save(CeLivestock ceLivestock) {
        return ceLivestockRepository.save(ceLivestock);
    }

     public Optional<CeLivestock> findById(String id) {
        return ceLivestockRepository.findById(id);
    }

    public void updateStatus(String id,String status){
        findById(id).ifPresent(dt->{
            dt.setCurrstatus(status);
            ceLivestockRepository.save(dt);
        });
    }

    // public Optional<CeLivestock> findByEnterpriseCode(String entercode) {
    //     return ceLivestockRepository.findById(entercode);
    // }

    // delete livestock
    public void delete(String id) {
        ceLivestockRepository.deleteById(id);
    }

    public Page<CeLivestock> findAll(String filter, Pageable pageable) {
        Specification<CeLivestock> spec = getSpec(filter);
        return ceLivestockRepository.findAll(spec, pageable);
    }

       public Page<CeLivestock> findAllSire(String filter, Pageable pageable) {
        Specification<CeLivestock> spec = getSpec(filter);
        return ceLivestockRepository.findAll(spec, pageable);
    }

       public Page<CeLivestock> findAllDam(String filter, Pageable pageable) {
        Specification<CeLivestock> spec = getSpec(filter);
        return ceLivestockRepository.findAll(spec, pageable);
    }
    public Page<CeLivestock> findAllDeath(String filter, Pageable pageable) {
        Specification<CeLivestock> specdeath = getSpecDeath(filter);
        return ceLivestockRepository.findAll(specdeath, pageable);
    }

     private static Specification<CeLivestock> getSpecDeath(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<CeLivestock> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("id"), filter)
                : null;

        //String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        String filterPattern = MessageFormat.format("{0}", filter.toLowerCase());
        Specification<CeLivestock> specstatus = (root, query, cb) -> cb.like(cb.lower(root.get("currstatus")), filterPattern);
        
        return Specification.where(specid).or(specstatus);
    }
    
    


    private static Specification<CeLivestock> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<CeLivestock> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("id"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<CeLivestock> specname = (root, query, cb) -> cb.like(cb.lower(root.get("name")), filterPattern);
        Specification<CeLivestock> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("sex")), filterPattern);

        return Specification.where(specid).or(specname).or(specremark);
    }

    
}
