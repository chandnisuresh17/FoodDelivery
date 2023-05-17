package com.example.demoo1.services;

import com.example.demoo1.Customer;
import com.example.demoo1.repository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customerServices implements customerService {
    @Autowired
    private customerRepo custRepo;
    @Override
    public Customer addCustomer(Customer cust){
        custRepo.save(cust);
        return cust;
    }

}
