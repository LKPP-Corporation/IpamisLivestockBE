package my.com.lcsb.korok.features.ceLivestock;

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
//import my.com.lcsb.korok.features.ceLivestock.CeLivestock;
import my.com.lcsb.korok.utilities.SortUtils;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/ceLivestock")
public class CeLivestockController {
    final private CeLivestockService ceLivestockService;

    //save ce_livestock
    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody CeLivestock ceLivestock) {
        return ResponseEntity.ok(ceLivestockService.save(ceLivestock));
    }

     // delete ce_livestock
    @Transactional
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        ceLivestockService.delete(id);
    }

    // get ce_livestock by id
    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Optional<CeLivestock> celivestock = ceLivestockService.findById(id);
        if (!celivestock.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ceLivestockService.findById(id));
    }

    @Transactional(readOnly = true)
    @GetMapping("/list")
    public Page<CeLivestock> findAll(@RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "id,asc") String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<CeLivestock> celivestockPage = ceLivestockService.findAll(filter, pageable);
        return celivestockPage;
    }

    @Transactional(readOnly = true)
    @GetMapping("/listsire")
    public Page<CeLivestock> findAllSire(@RequestParam(required = false, defaultValue = "0")int page,
           @RequestParam(required = false, defaultValue = "10") int size,
           @RequestParam(required = false, defaultValue = "id,asc") String sort,
            @RequestParam(required = false, defaultValue = "")String filter ){
                 Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
                 Page<CeLivestock> celivestockPage = ceLivestockService.findAllSire(filter, pageable);
                  return celivestockPage;
            }

    @Transactional(readOnly = true)
    @GetMapping("/listdam")
    public Page<CeLivestock> findAllDam(@RequestParam(required = false, defaultValue = "0")int page,
           @RequestParam(required = false, defaultValue = "10") int size,
           @RequestParam(required = false, defaultValue = "id,asc") String sort,
            @RequestParam(required = false, defaultValue = "")String filter ){
                 Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
                 Page<CeLivestock> celivestockPage = ceLivestockService.findAllDam(filter, pageable);
                  return celivestockPage;
            }

}
