package com.training.demorestservice.services;

import java.util.Collections;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.Patch;
import com.training.demorestservice.models.Employee;

@Service
public class SampleService {
	
	public Employee updateEmployee(Patch updatedEmployee) throws IllegalArgumentException, JsonPatchException, JsonProcessingException {
		final ObjectMapper mapper = new ObjectMapper();
		Employee existingEmployee = this.getSampleEmployee();
		JsonNode updatedJsonNode = updatedEmployee.apply(mapper.convertValue(existingEmployee, JsonNode.class));
		return mapper.convertValue(updatedJsonNode, Employee.class);
	}
	
	public Employee getSampleEmployee() {
		return new Employee("Henrick D.Patricia", "VS0091", "New York", 32, 48000.00, Collections.singletonList("PHIL003"));
	}

}
