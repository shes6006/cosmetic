package com.eoschu.cosmetic.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eoschu.cosmetic.model.User;
import com.eoschu.cosmetic.service.UserService;
import com.eoschu.cosmetic.service.UserServiceImpl;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/loginController", method = RequestMethod.GET)
	public String method(String userId, String password, Model model, HttpSession session, Locale locale) {
		User userBean = userService.getUserById(userId);
		if (userBean != null && userBean.getPassword().equals(password)) {
			return "redirect:/index";
		}
		return "/login";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String addUser(String userId, String password, String email) {
		System.out.println(userId+password+email);
		if (userId.length() !=0 && password.length()!= 0 && email.length()!=0) {
			User user = new User();
			user.setUserId(userId);
			user.setPassword(password);
			user.setEmailId(email);
			user.setEnabled(true);
			System.out.println(user);
			userService.addUser(user);
			
		}
		return "/index";
	}
}