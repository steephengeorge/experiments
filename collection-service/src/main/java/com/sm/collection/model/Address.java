package com.sm.collection.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String pin;
}
