package com.iro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iro.repository.model.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>{

}
