package com.training.other;

import org.springframework.stereotype.Service;

@Service
public class MockNumberService {

	public double addOffset(double x) {
		return(x  + 2.5);
	}
}
