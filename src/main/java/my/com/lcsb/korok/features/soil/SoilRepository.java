package my.com.lcsb.korok.features.soil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SoilRepository extends JpaRepository<Soil, Long>, JpaSpecificationExecutor<Soil> {

}
