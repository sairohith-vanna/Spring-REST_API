package com.training.demorestservice.services;

import org.springframework.stereotype.Service;

@Service
public class StringsService {

	public String convertToUppercase(String text) {
		return text.toUpperCase();
	}
}
