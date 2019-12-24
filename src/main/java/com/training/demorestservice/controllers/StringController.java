package com.training.demorestservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demorestservice.services.StringsService;

@RestController
@RequestMapping("strings")
public class StringController {
	
	@Autowired
	private StringsService service;

	@GetMapping("touc")
	public String convertToUC(@RequestBody String text) {
		return service.convertToUppercase(text);
	}
}
