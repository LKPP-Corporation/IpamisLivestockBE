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

    public Optional<BuyerInfo> findById(String id) {
        return buyerInfoRepository.findById(id);
    }

    // delete buyer info
    public void delete(String id) {
        buyerInfoRepository.deleteById(id);
    }

    public Page<BuyerInfo> findAll(String filter, Pageable pageable) {
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
                ? (root, query, builder) -> builder.equal(root.get("id"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<BuyerInfo> specname = (root, query, cb) -> cb.like(cb.lower(root.get("companyname")), filterPattern);
        //Specification<Soil> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("remark")), filterPattern);

        //return Specification.where(specid).or(specname).or(specremark);
        return Specification.where(specid).or(specname);
    }
}
