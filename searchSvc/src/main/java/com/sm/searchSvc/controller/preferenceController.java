package com.sm.searchSvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchSvc/api")
public class preferenceController {
	
	@GetMapping("/preferences")
	public List<String> getPreferences(){
		return List.of("reading", "music");
	}
}
