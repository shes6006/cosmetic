package com.eoschu.cosmetic.service;

import java.util.List;

import com.eoschu.cosmetic.model.User;

public interface UserService {
	List<User> getAllUsers();
	
	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);

}