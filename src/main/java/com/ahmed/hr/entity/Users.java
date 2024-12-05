package com.ahmed.hr.entity;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sec_users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String password;

@OneToOne(mappedBy = "users")
private Employee employee;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "sec_user_role",  joinColumns =   @JoinColumn(name ="user_id")
                                 , inverseJoinColumns = @JoinColumn(name = "role_id"))

private Set<Role> roles = new HashSet<>();

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
} 
public Set<Role> getRoles() {
	return roles;
}
public void setRoles(Set<Role> roles) {
	this.roles = roles;
}
}
