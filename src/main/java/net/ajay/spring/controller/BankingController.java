package net.ajay.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ajay.spring.dto.CustomerDetails;
import net.ajay.spring.service.BankingService;

@Controller
public class BankingController {

	@Autowired
	private BankingService service;

	@Autowired
	ObjectMapper objMapper;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String customerdetails(Model model) {

		model.addAttribute("customerDetails", new CustomerDetails());

		return "index";

	}

	@RequestMapping(value = "/addcustomer", method = RequestMethod.GET)
	public String addCustomerdetails(Model model) {

		model.addAttribute("customerDetails", new CustomerDetails());

		return "addcustomer";

	}

	@ModelAttribute("customerDetails")
	public CustomerDetails setUpUserForm() {
		return new CustomerDetails();
	}

	@RequestMapping(value = "/savecustomerdetails", method = RequestMethod.POST)
	public @ResponseBody ModelAndView saveCustomerDetails(
			@ModelAttribute("customerDetails") CustomerDetails customerDetails, HttpServletRequest request,
			HttpServletResponse response) {

		boolean status = service.saveCustomerDetails(customerDetails);

		ModelAndView model = new ModelAndView();

		if (status)
			model.setViewName("success");
		else
			model.setViewName("failure");

		return model;

	}

	@RequestMapping(value = "/getcustomerdetails/{id}", method = RequestMethod.GET)
	public @ResponseBody String getCustomerDetails(@PathVariable int id, HttpServletRequest request,
			HttpServletResponse response) throws JsonProcessingException {

		CustomerDetails cs = service.getCustomerDetails(id);

		cs.setAccount(null);
		cs.setTransactions(null);

		System.out.println("Output recieved" + cs.getFirstName());

		return objMapper.writeValueAsString(cs);

	}

	@RequestMapping(value = "/getcustomerdetails", method = RequestMethod.GET)
	public @ResponseBody ModelAndView getAllCustomerDetails(HttpServletRequest request, HttpServletResponse response)
			throws JsonProcessingException {

		List<CustomerDetails> cs = service.getAllCustomerDetails();

		ModelAndView model = new ModelAndView();

		model.addObject("customers", cs);

		model.setViewName("allcustomers");

		return model;

	}

}
