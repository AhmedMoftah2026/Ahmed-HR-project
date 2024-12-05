package com.ahmed.hr.config;
import java.util.HashSet;
import java.util.Set;

import com.ahmed.hr.entity.Users;
import com.ahmed.hr.service.RoleService;
import com.ahmed.hr.service.UsereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ahmed.hr.entity.Role;

@Component
public class AppStartUp implements CommandLineRunner {

	@Autowired
	private UsereService usereService;
	@Autowired
	private RoleService roleService;
	@Override
	public void run(String... args) throws Exception {
//		create roll
		if (usereService.findAll().isEmpty()) {
			
		
		Role role1 =new Role();
		role1.setName("Admin");
		roleService.addRole(role1);
		Role role2 =new Role();
		role2.setName("User");
		roleService.addRole(role2);
		
		Set<Role> adminRole= new HashSet<>();
		adminRole.add(role1);
		
		
		
		Set<Role> userRole= new HashSet<>();
		userRole.add(role2);
		
		
		
//		create user
		Users user1 =new Users();
		user1.setName("Admin");
		user1.setPassword("123");
		usereService.addUser(user1);
		
		Users user2 =new Users();
		user2.setName("User");
		user2.setPassword("123");
		usereService.addUser(user2);
		}
	}

}
