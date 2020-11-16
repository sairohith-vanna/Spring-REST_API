package com.training.demorestservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import com.training.demorestservice.models.Employee;
import com.training.demorestservice.models.ErrorResponse;
import com.training.demorestservice.services.SampleService;

@RestController
@RequestMapping("sample")
public class SampleController {

	private final SampleService sampleService;

	@Autowired
	public SampleController(SampleService sampleService) {
		this.sampleService = sampleService;
	}

	@PatchMapping("update")
	public ResponseEntity<Object> updateEmployee(@RequestBody JsonPatch updatedEmployeeDetails) {
		try {
			Employee updatedEmployee = sampleService.updateEmployee(updatedEmployeeDetails);
			return ResponseEntity.ok(updatedEmployee);
		} catch (IllegalArgumentException | JsonProcessingException | JsonPatchException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(500, "SYS_INT_ERR"));
		}
	}
	
	@PatchMapping("update/merge")
	public ResponseEntity<Object> updateEmployee(@RequestBody JsonMergePatch updatedEmployeeDetails) {
		try {
			Employee updatedEmployee = sampleService.updateEmployee(updatedEmployeeDetails);
			return ResponseEntity.ok(updatedEmployee);
		} catch (IllegalArgumentException | JsonProcessingException | JsonPatchException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(500, "SYS_INT_ERR"));
		}
	}
	
	@GetMapping("find")
	public ResponseEntity<Employee> findEmployee() {
		return ResponseEntity.ok(sampleService.getSampleEmployee());
	}
}
