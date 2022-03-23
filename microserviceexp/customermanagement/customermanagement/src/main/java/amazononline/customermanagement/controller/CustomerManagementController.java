package amazononline.customermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class CustomerManagementController {

	@Autowired
	RestTemplate restTemplate;

	

	@GetMapping(value = "/welcomecustomer")
	public String welcomeCall() {

		String response = restTemplate.exchange("http://ACCOUNTMANAGEMENT-SERVICES/account/welcomeaccount", HttpMethod.GET,
				null, new ParameterizedTypeReference<String>() {
				}).getBody();

		System.out.println("Response Received as " + response);

		return "Welcome to Customer Management  - " + response;
	}

}
