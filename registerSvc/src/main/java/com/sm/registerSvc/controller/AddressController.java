package com.sm.registerSvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registerSvc/api")
public class AddressController {
	@GetMapping("/address")
	public String getAddress() {
		return "Address1";
	}

}
