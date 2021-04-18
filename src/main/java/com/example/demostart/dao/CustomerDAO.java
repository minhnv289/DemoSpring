package com.example.demostart.dao;

import com.example.demostart.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}
