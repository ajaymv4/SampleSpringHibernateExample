package net.ajay.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ajay.spring.dto.CustomerDetails;

@Controller
public class HelloController {

	@ModelAttribute("customerDetails")
	   public CustomerDetails setUpUserForm() {
	      return new CustomerDetails();
	   }
	
	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");

		return "welcome";
	}
}