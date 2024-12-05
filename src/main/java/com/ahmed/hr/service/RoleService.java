package com.ahmed.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ahmed.hr.entity.Role;

@Service
public class RoleService {
 @Autowired
   private com.ahmed.hr.repository.RoleRepository RoleRepository;
 public List<Role> findAll(){
return	 RoleRepository.findAll();
 }
 
 public Role findById(Long id) {
	 return RoleRepository.findById(id).orElse(null);	
}
 

		public void addRole(Role newRole) {
			
			RoleRepository.save(newRole);
		}
		
		
	public void updateRole(Role newRole) {
			
		RoleRepository.save(newRole);
		}

	public void delateRole(Long id) {
		
		RoleRepository.deleteById(id);
	}

}
