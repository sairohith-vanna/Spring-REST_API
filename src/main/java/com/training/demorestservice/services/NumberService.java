package com.training.demorestservice.services;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

	public double findExponent(double a, double b) {
		return Math.pow(a, b);
	}
}
