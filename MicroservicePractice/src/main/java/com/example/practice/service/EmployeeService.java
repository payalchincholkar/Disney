package com.example.practice.service;

import java.util.List;

import com.example.practice.model.EmployeeEntity;

public interface EmployeeService {
  public EmployeeEntity addEmployee(EmployeeEntity employeeentity); 
  public List<EmployeeEntity> getEmployee();
  public EmployeeEntity updateEmployeeById(Integer id);
  public void deleteEmployeeById(Integer id);
  public EmployeeEntity updateEmployeeEntity(EmployeeEntity employeeEntity);
}
