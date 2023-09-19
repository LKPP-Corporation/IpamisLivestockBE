package my.com.lcsb.korok.features.speciesInfo;

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
import my.com.lcsb.korok.utilities.SortUtils;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/speciesInfo")
public class SpeciesInfoController {
    final private SpeciesInfoService speciesInfoService;

    //save enterprise info
    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody SpeciesInfo enterpriseInfo) {
        return ResponseEntity.ok(speciesInfoService.save(enterpriseInfo));
    }

     // delete enterprise
    @Transactional
    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        speciesInfoService.delete(code);
    }

     // get enterprise by code
    @Transactional(readOnly = true)
    @GetMapping("/{code}")
    public ResponseEntity<?> findById(@PathVariable String code) {
        Optional<SpeciesInfo> enterpriseInfo = speciesInfoService.findById(code);
        if (!enterpriseInfo.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(speciesInfoService.findById(code));
    }
    
@Transactional(readOnly=true)
@GetMapping("/list")
public Page<SpeciesInfo> findall(@RequestParam(required=false , defaultValue="0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "code,asc") String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<SpeciesInfo> enterpriseInfoPage = speciesInfoService.findAll(filter, pageable);
        return enterpriseInfoPage;
    }
}
