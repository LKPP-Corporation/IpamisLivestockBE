package my.com.lcsb.korok.features.enterpriseInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnterpriseInfoRepository extends JpaRepository<EnterpriseInfo, String>, JpaSpecificationExecutor<EnterpriseInfo>{
    
}
