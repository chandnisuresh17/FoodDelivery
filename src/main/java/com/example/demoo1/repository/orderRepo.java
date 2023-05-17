package com.example.demoo1.repository;

import com.example.demoo1.orders;
import org.springframework.data.repository.CrudRepository;

public interface orderRepo extends CrudRepository<orders, Integer> {
}
