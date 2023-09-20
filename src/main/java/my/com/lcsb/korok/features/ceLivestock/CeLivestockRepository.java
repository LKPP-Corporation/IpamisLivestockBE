package my.com.lcsb.korok.features.ceLivestock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CeLivestockRepository extends JpaRepository<CeLivestock, String>, JpaSpecificationExecutor<CeLivestock> {
    
}
