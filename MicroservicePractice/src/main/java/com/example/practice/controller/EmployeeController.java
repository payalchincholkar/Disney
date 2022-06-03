package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.model.EmployeeEntity;
import com.example.practice.service.EmployeeService;

@RestController
@RequestMapping("/employee-info")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add-data")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return this.employeeService.addEmployee(employeeEntity);
	}

	@GetMapping("/view")
	public ResponseEntity<?> getAllEmployee() {
		return ResponseEntity.ok(this.employeeService.getEmployee());
	}

	@PutMapping("update")
	public EmployeeEntity updatEmployeeEntity(@RequestBody EmployeeEntity employeeEntity) {
		return this.employeeService.updateEmployeeEntity(employeeEntity);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(this.employeeService.updateEmployeeById(id));
	}

	@DeleteMapping("/delete/{id}")
	public int deleteGuest(@PathVariable Integer id) {
		this.employeeService.deleteEmployeeById(id);
		return id;
	}

   
}
