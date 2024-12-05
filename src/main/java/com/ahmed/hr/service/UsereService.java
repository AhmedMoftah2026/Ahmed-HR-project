package com.ahmed.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ahmed.hr.entity.Users;

@Service
public class UsereService {
 @Autowired
   private com.ahmed.hr.repository.UsersRepository UsersRepository;
 public List<Users> findAll(){
return	 UsersRepository.findAll();
 }
 
 public Users findById(Long id) {
	 return UsersRepository.findById(id).orElse(null);	
}
 

		public void addUser(Users newUser) {
			
			UsersRepository.save(newUser);
		}
		
		
	public void updateUser(Users newUser) {
			
		UsersRepository.save(newUser);
		}

	public void delateUser(Long id) {
		
		UsersRepository.deleteById(id);
	}

}
