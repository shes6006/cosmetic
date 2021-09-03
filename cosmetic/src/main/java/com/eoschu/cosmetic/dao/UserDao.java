package com.eoschu.cosmetic.dao;

import java.util.List;

import com.eoschu.cosmetic.model.User;

public interface UserDao {

	List<User> getAllUsers();

	User getUserById(String userId);
	
	void deleteUser(String userId);
	
	void addUser(User user);
	

}