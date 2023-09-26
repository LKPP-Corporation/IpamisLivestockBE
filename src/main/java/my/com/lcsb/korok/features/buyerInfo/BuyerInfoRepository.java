package my.com.lcsb.korok.features.buyerInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BuyerInfoRepository extends JpaRepository<BuyerInfo, String>, JpaSpecificationExecutor<BuyerInfo> {
    
}
