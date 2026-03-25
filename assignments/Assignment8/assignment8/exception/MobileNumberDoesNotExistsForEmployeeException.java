package com.example.assignment8.exception;

public class MobileNumberDoesNotExistsForEmployeeException extends RuntimeException {
	  public MobileNumberDoesNotExistsForEmployeeException() {
		  super("there is no employee with such mobile number!");
	  }
	}
