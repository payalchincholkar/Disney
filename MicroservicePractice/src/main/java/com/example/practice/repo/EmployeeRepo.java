package com.example.practice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.practice.model.EmployeeEntity;

public interface EmployeeRepo extends MongoRepository<EmployeeEntity, Integer> {

}
