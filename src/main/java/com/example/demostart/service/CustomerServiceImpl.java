package com.example.demostart.service;

import com.example.demostart.dao.CustomerDAO;
import com.example.demostart.exception.CustomerNotFoundException;
import com.example.demostart.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    @Override
    public String addCustomer(Customer customer) {
//        customer.setId(customer.getId());
//        customer.setFirstName(customer.getFirstName());
//        customer.setLastName(customer.getLastName());
//        customer.setEmail(customer.getEmail());
//        customerList.add(customer);
//        return customer;
        customerDAO.save(customer);
        return ErrorCode.return00Customer(customer);
    }

    @Override
    public String getCustomers() {
        return ErrorCode.return00Customer(customerDAO.findAll());
    }

    @Override
    public String getCustomerId(int id) {
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == id)
//                .findFirst()
//                .get();
        Optional<Customer> optionalCustomer = customerDAO.findById(id);
        if (!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("méo tìm tháy");
        return ErrorCode.return00Customer(optionalCustomer.get());
    }

    @Override
    public String updateCustomer(int id, Customer customer) {
//        customerList.stream().forEach(c -> {
//            if (c.getCustomerId() == id) {
//                c.setCustomerFirstName(customer.getCustomerFirstName());
//                c.setCustomerLastName(customer.getCustomerLastName());
//                c.setCustomerEmail(customer.getCustomerEmail());
//            }
//        });
//        Customer customerUpdate = customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == id)
//                .findFirst()
//                .get();
        customer.setCustomerId(id);
        customerDAO.save(customer);
        return ErrorCode.return00Customer(customer);
    }

    @Override
    public String deleteCustomer(int id) {
//        customerList.stream().forEach(c -> {
//            if (c.getCustomerId() == id) {
//                customerList.remove(c);
//            }
//        });
        customerDAO.deleteById(id);
        return ErrorCode.return00();
    }
}
