package com.ahmed.hr.service;

import java.util.List;

import com.ahmed.hr.entity.Employee;
import com.ahmed.hr.repository.EployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.hr.error.RecordNotFoundException;

@Service
public class EmployeeService {
 @Autowired
   private EployeeRepository eployeeRepository;
 
 public List<Employee> getDeptEmps(Long deptId){
	return eployeeRepository.findByDepartmentId(deptId);
 }
 
 public List<Employee> getAllEmployees(){
	return eployeeRepository.findAll();
}
 
 public Employee getAllEmpById(Integer id){
		return eployeeRepository.findById(id).orElseThrow(()-> new RecordNotFoundException("this employee not found"+id));
		
	}
 
 
 public List<Employee> getEmpByFirstName(String firstName){
		
		return	eployeeRepository.findByFirstName(firstName);
		}
		
		public List<Employee> getempSearch(String firstName,String lastName){
			
			return	eployeeRepository.getempSearch(firstName, lastName);
			}
		public void addEmp(Employee newEmp) {
			
			eployeeRepository.save(newEmp);
		}
		
		
	public void updateEmp(Employee newEmp) {
			
		eployeeRepository.save(newEmp);
		}

	public void delateEmp(Integer id) {
		
		eployeeRepository.deleteById(id);
	}

}
