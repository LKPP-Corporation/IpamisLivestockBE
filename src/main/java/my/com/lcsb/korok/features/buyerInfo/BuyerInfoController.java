package my.com.lcsb.korok.features.buyerInfo;

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
@RequestMapping("/api/v1/buyerInfo")
public class BuyerInfoController {
    final private BuyerInfoService buyerInfoService;

    //save buyer info
    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody BuyerInfo buyerInfo) {
        return ResponseEntity.ok(buyerInfoService.save(buyerInfo));
    }

    // delete buyer info
    @Transactional
    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        buyerInfoService.delete(code);
    }

     // get buyer info by id
    @Transactional(readOnly = true)
    @GetMapping("/{code}")
    public ResponseEntity<?> findById(@PathVariable String code) {
        Optional<BuyerInfo> buyerinfo = buyerInfoService.findById(code);
        if (!buyerinfo.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(buyerInfoService.findById(code));
    }

    @Transactional(readOnly = true)
    @GetMapping("/list")
    public Page<BuyerInfo> findAll(@RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "code,asc") String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        Page<BuyerInfo> buyerinfoPage = buyerInfoService.findAll(filter, pageable);
        return buyerinfoPage;
    }

    @Transactional(readOnly = true)
    @GetMapping("/listbuyer")
    public Page<BuyerInfo> findAllBuyer(@RequestParam(required = false, defaultValue = "0")int page,
           @RequestParam(required = false, defaultValue = "10") int size,
           @RequestParam(required = false, defaultValue = "code,asc") String sort,
            @RequestParam(required = false, defaultValue = "")String filter ){
                 Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
                 Page<BuyerInfo> buyerinfoPage = buyerInfoService.findAllBuyer(filter, pageable);
                  return buyerinfoPage;
            }
}
