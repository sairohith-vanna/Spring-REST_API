package com.training.demorestservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.demorestservice.services.NumberService;
import com.training.other.MockNumberService;

@RestController
@RequestMapping("numbers")
public class NumberController {

	@Autowired
	private NumberService numberService;
	
	@Autowired
	private MockNumberService mockService;
	
	@GetMapping("power")
	public double getPower(@RequestParam double a, @RequestParam double b) {
		return numberService.findExponent(a, b);
	}
	
	@GetMapping("poffset")
	public double getPowerWithOffset(@RequestParam double a, @RequestParam double b) {
		double exp = numberService.findExponent(a, b);
		return mockService.addOffset(exp);
	}
}
