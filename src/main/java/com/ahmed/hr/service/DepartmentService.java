package com.ahmed.hr.service;

import java.util.List;

import com.ahmed.hr.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.hr.entity.Department;


@Service
public class DepartmentService {
	 @Autowired
	   private DepartmentRepository departmentRepository;
	 
	 public List<Department> getAllDepart(){
		return departmentRepository.findAll();
	}
	 
	 public Department getAllDepartById(Long id){
			return departmentRepository.findById(id).orElseThrow(null);
			
		}
	 
	 
	 
			public void addDepart(Department newDepart) {
				
				departmentRepository.save(newDepart);
			}
			
			
		public void updateDepart(Department newDepart) {
				
			departmentRepository.save(newDepart);
			}

		public void delateDepart(Long deptid) {
			
			departmentRepository.deleteById(deptid);
		}

}
