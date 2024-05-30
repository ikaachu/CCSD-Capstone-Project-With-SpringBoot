package com.capstone.ccsd.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login-seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public List<Seller> getAllSellers() {
        return sellerService.getAllSellers();
    }

    @GetMapping("/{id}")
    public Seller getSellerById(@PathVariable Integer id) {
        return sellerService.getSellerById(id);
    }

    @PostMapping
    public void addSeller(@RequestBody Seller seller) {
        sellerService.saveSeller(seller);
    }

    @DeleteMapping("/{id}")
    public void deleteSeller(@PathVariable Integer id) {
        sellerService.deleteSeller(id);
    }
}
