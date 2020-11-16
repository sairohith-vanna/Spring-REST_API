package com.training.demorestservice.models;

public class ErrorResponse {
	
	private int statusCode;
	private String errorCode;
	
	public ErrorResponse(int statusCode, String errorCode) {
		this.statusCode = statusCode;
		this.errorCode = errorCode;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
