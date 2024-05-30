package com.capstone.ccsd.cust_update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustUpdateRepository extends JpaRepository<CustUpdate, Integer>{
}
