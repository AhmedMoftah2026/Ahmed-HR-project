package com.ahmed.hr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ahmed.hr.entity.Employee;
@Repository
public interface EployeeRepository extends JpaRepository<Employee, Integer> {
	public  List<Employee> findByFirstName(String firstName);
	@Query("select emp from Employee emp where emp.firstName = :firstNameBind and emp.lastName = :lastNameBind")
	public List<Employee> getempSearch(@Param("firstNameBind")String firstName,@Param("lastNameBind")String lastName);
		public List<Employee> findByDepartmentId(Long departmentId);
		
		
		

	}

