package my.com.lcsb.korok.features.enterpriseInfo;

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


import lombok.RequiredArgsConstructor;
//import my.com.lcsb.korok.features.enterpriseInfo.EnterpriseInfo;
import my.com.lcsb.korok.utilities.SortUtils;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/enterpriseInfo")
public class EnterpriseInfoController {
    final private EnterpriseInfoService enterpriseInfoService;

    //save enterprise info
    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody EnterpriseInfo enterpriseInfo) {
        return ResponseEntity.ok(enterpriseInfoService.save(enterpriseInfo));
    }

     // delete enterprise
    @Transactional
    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        enterpriseInfoService.delete(code);
    }

     // get enterprise by code
    @Transactional(readOnly = true)
    @GetMapping("/{code}")
    public ResponseEntity<?> findById(@PathVariable String code) {
        Optional<EnterpriseInfo> enterpriseInfo = enterpriseInfoService.findById(code);
        if (!enterpriseInfo.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(enterpriseInfoService.findById(code));
    }
    
@Transactional(readOnly=true)
@GetMapping("/list")
public Page<EnterpriseInfo> findall(@RequestParam(required=false , defaultValue="0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "code,asc") String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<EnterpriseInfo> enterpriseInfoPage = enterpriseInfoService.findAll(filter, pageable);
        return enterpriseInfoPage;
    }

    @Transactional(readOnly=true)
@GetMapping("/listall")
public Page<EnterpriseInfo> findallByLivestock(@RequestParam(required=false , defaultValue="0") int page,
            @RequestParam(required = false, defaultValue = "100") int size,
            @RequestParam(required = false, defaultValue = "code,asc") String sort,
            @RequestParam(required = false, defaultValue = "Livestock") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<EnterpriseInfo> enterpriseInfoPage = enterpriseInfoService.findAll(filter, pageable);
        return enterpriseInfoPage;
    }


    
}
