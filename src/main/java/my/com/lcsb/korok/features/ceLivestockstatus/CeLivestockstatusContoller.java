package my.com.lcsb.korok.features.ceLivestockstatus;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import my.com.lcsb.korok.features.ceLivestock.CeLivestock;
import lombok.RequiredArgsConstructor;
import my.com.lcsb.korok.features.buyerInfo.BuyerInfo;
import my.com.lcsb.korok.features.ceLivestock.CeLivestockService;
import my.com.lcsb.korok.utilities.SortUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/ceLivestockstatus")
public class CeLivestockstatusContoller {
    
     final private CeLivestockstatusService ceLivestockstatusService;
     final private CeLivestockService ceLivestockService;

    //save ce_livestockstatus
    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody CeLivestockstatus ceLivestockstatus) {
        ceLivestockService.updateStatus(ceLivestockstatus.getTempMasterId(),ceLivestockstatus.getStatus());
        ceLivestockstatus.setMaster(ceLivestockService.findById(ceLivestockstatus.getTempMasterId()).get());
        //ceLivestockstatusService.save(ceLivestockstatus);
        return ResponseEntity.ok(ceLivestockstatusService.save(ceLivestockstatus));
    }

     // delete ce_livestockstatus
    @Transactional
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ceLivestockstatusService.delete(id);
    }

    // get ce_livestockstatus by id
    // @Transactional(readOnly = true)
    // @GetMapping("/regid/{regid}")
    // public ResponseEntity<?> findById(@PathVariable String regid) {
    //     log.info("regid",regid);
    //     Optional<CeLivestockstatus> celivestockstatus = ceLivestockstatusService.findByRegId(regid);
    //     log.info("celivestockstatus {}",celivestockstatus.isPresent());
    //     if (!celivestockstatus.isPresent()) {
    //         return ResponseEntity.notFound().build();
    //     }
    //     return ResponseEntity.ok(celivestockstatus.get());
    // }


    @Transactional(readOnly = true)
    @GetMapping("/list")
    public Page<CeLivestockstatus> findAll(@RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "regid,asc") String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<CeLivestockstatus> celivestockstatusPage = ceLivestockstatusService.findAll(filter, pageable).map((dt)->{
            dt.setTempMasterId(dt.getMaster().getId());
            return dt;
        }
        );
        return celivestockstatusPage;
    }

}
