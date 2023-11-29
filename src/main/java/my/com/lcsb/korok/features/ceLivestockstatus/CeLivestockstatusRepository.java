package my.com.lcsb.korok.features.ceLivestockstatus;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CeLivestockstatusRepository extends JpaRepository<CeLivestockstatus , Long> , JpaSpecificationExecutor<CeLivestockstatus>  {
    
    // Optional<CeLivestockstatus> findByRegid(String regid);
}
