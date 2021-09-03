package com.eoschu.cosmetic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eoschu.cosmetic.model.User;

//@Service
//@Transactional
//public class LoginService {
//	@Autowired
//	private static UserServiceImpl userServiceImpl;
//	
//	public static User login(String userId, String password) {
//		System.out.println("loginService get userId: "+userId);
//		User bean =userServiceImpl.getUserById(userId);
//		System.out.println("bean is "+ bean);
//		if(bean!=null) {
//			if(password!=null && password.length()!=0) {
//				String pass = bean.getPassword();
//				if(pass==password) {
//					return bean;
//				}
//			}
//		}
//		return null;
//	}
	
//	public boolean changePassword(String userId, String username, String oldPassword, String newPassword) {
//		User bean = this.login(userId, username, oldPassword);
//		if(bean!=null) {
//			return userDao.update(temp, bean.getEmail(), bean.getBirth(), username);
//		}
//		return false;
//	}
//}
