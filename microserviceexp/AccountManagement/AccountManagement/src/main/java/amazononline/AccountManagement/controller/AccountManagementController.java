package amazononline.AccountManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountManagementController {

	@GetMapping(value = "/welcomeaccount")
	public String welcomeCall() {
		return "Welcome to  Account management";
	}

}
