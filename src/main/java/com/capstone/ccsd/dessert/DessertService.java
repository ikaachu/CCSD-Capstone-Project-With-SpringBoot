package com.capstone.ccsd.dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DessertService {

    @Autowired
    private DessertRepository dessertRepository;

    public List<Dessert> getAllDesserts() {
        return dessertRepository.findAll();
    }

    public Dessert getDessertById(Integer id) {
        return dessertRepository.findById(id).orElse(null);
    }

    public Dessert saveDessert(Dessert dessert) {
        return dessertRepository.save(dessert);
    }

    public void deleteDessert(Integer id) {
        dessertRepository.deleteById(id);
    }
}
