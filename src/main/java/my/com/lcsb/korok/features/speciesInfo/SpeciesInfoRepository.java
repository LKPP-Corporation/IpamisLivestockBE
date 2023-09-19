package my.com.lcsb.korok.features.speciesInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SpeciesInfoRepository extends JpaRepository<SpeciesInfo, String>, JpaSpecificationExecutor<SpeciesInfo> {
    
}
