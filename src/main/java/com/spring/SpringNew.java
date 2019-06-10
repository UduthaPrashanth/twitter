package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringNew {
	@RequestMapping(value="/Register")
public String register(@RequestParam("username") String name,@RequestParam("mbl") String Mobile,@RequestParam("pwd") String Password,@RequestParam("city") String city,Model model){
	
		System.out.println("hello java");
		model.addAttribute("name", name);
		return "profile";
}
}
