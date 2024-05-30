package com.capstone.ccsd.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dessert")
public class DessertController {

    @Autowired
    private DessertService dessertService;

    @GetMapping
    public List<Dessert> getAllDesserts() {
        return dessertService.getAllDesserts();
    }

    @GetMapping("/{id}")
    public Dessert getDessertById(@PathVariable Integer id) {
        return dessertService.getDessertById(id);
    }

    @PostMapping
    public void addDessert(@RequestBody Dessert dessert) {
        dessertService.saveDessert(dessert);
    }

    @DeleteMapping("/{id}")
    public void deleteDessert(@PathVariable Integer id) {
        dessertService.deleteDessert(id);
    }
}
