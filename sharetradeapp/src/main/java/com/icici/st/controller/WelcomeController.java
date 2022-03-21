package com.icici.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icici.st.model.Customer;
import com.icici.st.service.CustomerService;

@Controller
public class WelcomeController {
	
	
	@Autowired
	private CustomerService cs;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(Model model) {
		model.addAttribute("message", "This is my first MVC page");
		return "welcome";
	}

	@RequestMapping(value = "/showRegForm", method = RequestMethod.GET)
	public String showRegForm(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("CusformName", "Customer Registration Form");
		return "registrationForm";
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String save(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer.getFirstName());
		// save to database....
		cs.saveCustomer(customer);
		return "redirect:/dashboard";// will redirect to viewemp request mapping
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model) {
		model.addAttribute("customerList", cs.listCustomer());
		return "dashboard";
	}
	
	@GetMapping("/showCustomerEditForm/{customerId}")
    public String showFormForUpdate(@PathVariable("customerId") int customerId,
        Model model) {
		
		System.out.println(customerId);
		model.addAttribute("customer" , cs.getCustomer(customerId));
        
        return "customerEditForm";
    }
	
	
	@RequestMapping(value = "/editCustomer", method = RequestMethod.POST)
	public String editCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer.getFirstName());
		// save to database....
		cs.updateCustomer(customer);
		return "redirect:/dashboard";// will redirect to viewemp request mapping
	}
	


}
