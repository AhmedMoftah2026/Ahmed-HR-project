package com.ahmed.hr.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
	@Column(name = "firstName")
private String firstName;
	@Column(name = "lastName")
private String lastName;
	@Column(name = "address")
private String address;
	@Column(name = "salary")
private Double salary;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Department department;
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users users;
	
public Employee(Integer id, String firstName, String lastName, String address, Double salary, Department department) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.salary = salary;
	this.department = department;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Users getUsers() {
	return users;
}
public void setUsers(Users users) {
	this.users = users;
}

}
