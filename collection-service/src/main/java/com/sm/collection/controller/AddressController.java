package com.sm.collection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sm.collection.model.Address;
import com.sm.collection.service.AddressService;

@RestController
public class AddressController {
	
	private AddressService addressService;
	
	public AddressController(AddressService addressService) {
		
		this.addressService = addressService;		
	}
	
	@PostMapping("/address")
	public void collectAddress(@RequestParam(required = true) Address address) {
		
		addressService.collectAddress(address);
	}
	
	@GetMapping("/address")
	public Address getAddress(){
		
		return Address.builder()
				     .address1("123 Pike Dr")
				     .city("Philadelphia")
				     .state("PA")
				     .country("USA")
				     .pin("23456")
				     .build();
	}

}
