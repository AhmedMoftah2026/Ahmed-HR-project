package com.ahmed.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmed.hr.entity.Employee;
import com.ahmed.hr.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/employee")

public class EmployeeController {
	@Autowired
private EmployeeService employeeService;
	@Operation(summary = "gtt all employees by department")
	@GetMapping("/departments/{deptId}/employeesall")
	public List<Employee> getDeptEmpe(@PathVariable Long deptId){
		return employeeService.getDeptEmps(deptId);
	}
	
	@Operation(summary = "get all employee")
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employeesbyid/{id}")
	public Employee getAllEmpById(@PathVariable Integer id){
		return employeeService.getAllEmpById(id);
	}
	@GetMapping("/employeesbyname/{firstName}")
	public List<Employee>  geteEmpByFirstName(@PathVariable String firstName){
		
		return employeeService.getEmpByFirstName(firstName);
	}
	
	
	@GetMapping("/employeesbysearch/{firstName}/{lastName}")
	public List<Employee>  getempSearch(@PathVariable String firstName,@PathVariable String lastName){
		
		return employeeService.getempSearch(firstName, lastName);
	}
	@Operation(summary = "add emp")
	@PostMapping("/add")
	public String addEmp(@RequestBody Employee newEmp) {
		employeeService.addEmp(newEmp);
		return "saved successfuly";
	}
	@Operation(summary = "update recod emp")
	@PutMapping("/update")
	public String updateEmp(@RequestBody Employee newEmp) {
		employeeService.updateEmp(newEmp);
		return "updated successfuly";
	}
	
	@DeleteMapping("/delete-by-employee-id/{id}")
	public String delateEmp(@PathVariable Integer id) {
		employeeService.delateEmp(id);
		return "delated successfuly";
	}
	
}
