package com.ahmed.hr.controller;

import java.util.List;

import com.ahmed.hr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmed.hr.entity.Department;


@RestController
@RequestMapping("/api/v1/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
		@GetMapping("/alldepart")
		public List<Department> getAllDepart(){
			return departmentService.getAllDepart();
		}
		
		@GetMapping("/gtby_id/{id}")
		public Department getAllDepartById(@PathVariable Long id){
			return departmentService.getAllDepartById(id);
		}
		
		
		@PostMapping("/adddepart")
		public String addDepart(@RequestBody Department newDpart) {
			departmentService.addDepart(newDpart);
			return "saved successfuly";
		}
		@PutMapping("/updatedepart")
		public String updateDepart(@RequestBody Department newDpart) {
			departmentService.updateDepart(newDpart);
			return "updated successfuly";
		}
		
		@DeleteMapping("/delateby_id/{deptid}")
		public String delateDepart(@PathVariable Long deptid) {
			departmentService.delateDepart(deptid);
			return "delated successfuly";
		}
		
}
