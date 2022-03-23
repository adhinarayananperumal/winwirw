package icici.ta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import icici.ta.pojo.CustomerPojo;
import icici.ta.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/welcome")
	public String welcomeCall() {
		return "Welcome to Icici Bank";
	}

	@PostMapping(value = "/save")
	public CustomerPojo saveCustomer(@RequestBody CustomerPojo customerPojo) {

		customerService.saveCustomer(customerPojo);
		return customerPojo;
	}

	@GetMapping("/get/{firstName}")
	public CustomerPojo getCustomer(@PathVariable("firstName") String firstName) {

		CustomerPojo customerPojo = customerService.findByFirstName(firstName);

		return customerPojo;
	}

	@GetMapping("/retriveByFirstName/{firstName}")
	public List<CustomerPojo> retrieveByFirstName(@PathVariable("firstName") String firstName) {

		return customerService.retrieveByFirstName(firstName);
	}

}
