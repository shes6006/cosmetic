package com.eoschu.cosmetic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
}
