package com.example.demostart.service;

import com.example.demostart.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public String addCustomer(Customer customer);

    public String getCustomers();

    public String getCustomerId(int id);

    public String updateCustomer(int id, Customer customer);

    public String deleteCustomer(int id);
}
