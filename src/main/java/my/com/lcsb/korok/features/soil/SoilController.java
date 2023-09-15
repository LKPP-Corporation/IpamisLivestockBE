package my.com.lcsb.korok.features.soil;

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
@RequestMapping("/api/v1/soil")
public class SoilController {
    final private SoilService soilService;

    // save soil
    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Soil soil) {
        return ResponseEntity.ok(soilService.save(soil));
    }

    // delete soil
    @Transactional
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        soilService.delete(id);
    }

    // get soil by id
    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Soil> soil = soilService.findById(id);
        if (!soil.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(soilService.findById(id));
    }

    @Transactional(readOnly = true)
    @GetMapping("/list")
    public Page<Soil> findAll(@RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "id,asc") String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<Soil> soilPage = soilService.findAll(filter, pageable);
        return soilPage;
    }

}
