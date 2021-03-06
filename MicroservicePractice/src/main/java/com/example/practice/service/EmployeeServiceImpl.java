package com.example.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.model.EmployeeEntity;
import com.example.practice.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeEntity addEmployee(EmployeeEntity employeeentity) {
		
		return employeeRepo.save(employeeentity) ;
	}

	@Override
	public List<EmployeeEntity> getEmployee() {
		
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeEntity updateEmployeeById(Integer id) {
	
		return employeeRepo.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Integer id) {
	employeeRepo.deleteById(id);
		
	}

	@Override
	public EmployeeEntity updateEmployeeEntity(EmployeeEntity employeeEntity) {
		
		return this.employeeRepo.save(employeeEntity);
	}

}
