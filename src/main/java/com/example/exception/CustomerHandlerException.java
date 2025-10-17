package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerHandlerException {

	@ExceptionHandler(CustomerNotFoundException.class ) 
	public ResponseEntity<String> 
	handleCustomer(CustomerNotFoundException cnfe) { 
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found "+cnfe.getMessage());
	}
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleGeneric(Exception ex) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
	    }
	}
	
