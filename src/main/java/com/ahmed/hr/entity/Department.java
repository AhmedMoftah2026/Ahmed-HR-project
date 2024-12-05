package com.ahmed.hr.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long deptid;
	@Column(name = "departmentname")
private String departmentName;
	@JsonManagedReference
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
	public Department(Long deptid, String departmentName) {
		super();
		this.deptid = deptid;
		this.departmentName = departmentName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return deptid;
	}
	public void setId(Long dept) {
		this.deptid = dept;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
