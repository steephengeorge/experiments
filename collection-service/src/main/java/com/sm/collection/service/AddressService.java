package com.sm.collection.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sm.collection.model.Address;

@Service
public class AddressService {
	
	private List<Address> addressList;
	public AddressService() {
		addressList = new ArrayList<>();
	}
	
	public void collectAddress(Address address) {
		addressList.add(address);
	}
	 

}
