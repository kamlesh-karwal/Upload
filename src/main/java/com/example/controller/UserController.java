package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	
	@GetMapping("/")
	public ModelAndView saveData() {
		ModelAndView model = new ModelAndView();
		model.addObject("obj", new User());
		model.setViewName("index");
		return model;
	}
	@PostMapping("/user")
	public String getData( User user, BindingResult result , Model model) {
		if(result.hasErrors()) {
			return "success";
		}else {
		System.out.println(user);
		//ModelAndView model = new ModelAndView();
		model.addAttribute("msg", "Success");
		return "success";
		}
		//model.setViewName("success");
		//return model;
	}
	
}
