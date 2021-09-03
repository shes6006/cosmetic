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
	
	@RequestMapping(value="/loginController", method = RequestMethod.GET)
	public String method(String userId, String password,
			Model model, HttpSession session, Locale locale) {
		
		User userBean = userService.getUserById(userId);
		System.out.println(userBean);
		System.out.println(userBean.getPassword());
		if(userBean!=null && userBean.getPassword().equals(password)) {
			return "redirect:/index";
		}
		return "/login";
	}
}