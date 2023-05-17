package com.example.demoo1.controllers;

import com.example.demoo1.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demoo1.services.customerService;


public class customerController {
    @Autowired
    private customerService custService;
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer cust){
        custService.addCustomer(cust);
        return cust;
    }
}
