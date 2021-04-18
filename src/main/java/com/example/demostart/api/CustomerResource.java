package com.example.demostart.api;

import com.example.demostart.model.Customer;
import com.example.demostart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/addCustomer")
    public String addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping(value = "/getCustomers")
    public String getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(value = "/{id}")
    public String getCustomerId(@PathVariable("id") int id) {
        return customerService.getCustomerId(id);
    }

    @PutMapping(value = "/{id}")
    public String updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        return customerService.deleteCustomer(id);
    }
}
