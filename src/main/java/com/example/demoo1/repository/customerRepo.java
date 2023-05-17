package com.example.demoo1.repository;

import com.example.demoo1.Customer;
import org.springframework.data.repository.CrudRepository;

public interface customerRepo extends CrudRepository<Customer, Integer> {
}
