package com.capstone.ccsd.cust_update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustUpdateService {

    @Autowired
    private CustUpdateRepository custUpdateRepository;

    public List<CustUpdate> getAllCustUpdates() {
        return custUpdateRepository.findAll();
    }

    public CustUpdate getCustUpdateById(Integer id) {
        return custUpdateRepository.findById(id).orElse(null);
    }

    public CustUpdate saveCustUpdate(CustUpdate custUpdate) {
        return custUpdateRepository.save(custUpdate);
    }

    public void deleteCustUpdate(Integer id) {
        custUpdateRepository.deleteById(id);
    }
}
