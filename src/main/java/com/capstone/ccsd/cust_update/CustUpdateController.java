package com.capstone.ccsd.cust_update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cust-update")
public class CustUpdateController {

    @Autowired
    private CustUpdateService custUpdateService;

    @GetMapping
    public List<CustUpdate> getAllCustUpdates() {
        return custUpdateService.getAllCustUpdates();
    }

    @GetMapping("/{id}")
    public CustUpdate getCustUpdateById(@PathVariable Integer id) {
        return custUpdateService.getCustUpdateById(id);
    }

    @PostMapping
    public void addCustUpdate(@RequestBody CustUpdate custUpdate) {
        custUpdateService.saveCustUpdate(custUpdate);
    }

    @DeleteMapping("/{id}")
    public void deleteCustUpdate(@PathVariable Integer id) {
        custUpdateService.deleteCustUpdate(id);
    }
}
