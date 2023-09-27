package my.com.lcsb.korok.features.buyerInfo;

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
public class BuyerInfoService {
    
    final private BuyerInfoRepository buyerInfoRepository;

    public BuyerInfo save(BuyerInfo buyerInfo) {
        return buyerInfoRepository.save(buyerInfo);
    }

    public Optional<BuyerInfo> findById(String code) {
        return buyerInfoRepository.findById(code);
    }

    // delete buyer info
    public void delete(String code) {
        buyerInfoRepository.deleteById(code);
    }

    public Page<BuyerInfo> findAll(String filter, Pageable pageable) {
        Specification<BuyerInfo> spec = getSpec(filter);
        return buyerInfoRepository.findAll(spec, pageable);
    }

      public Page<BuyerInfo> findAllBuyer(String filter, Pageable pageable) {
        Specification<BuyerInfo> spec = getSpec(filter);
        return buyerInfoRepository.findAll(spec, pageable);
    }

    private static Specification<BuyerInfo> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

    Specification<BuyerInfo> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("code"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<BuyerInfo> specname = (root, query, cb) -> cb.like(cb.lower(root.get("companyname")), filterPattern);
        
        return Specification.where(specid).or(specname);
    }
    
}
