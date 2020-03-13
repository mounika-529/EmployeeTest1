package com.Employee.Exception;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.Employee.Domain.EmployeePojo;

@ControllerAdvice
public class EmployeeExceptionController   {
	
	 @ExceptionHandler(value = EmployeeNotFound.class)
	   public ResponseEntity<Object> exception(EmployeeNotFound exception ,final HttpServletRequest request) {
		 System.out.println("error message");
		 List<String> details = new ArrayList<>();
	        details.add(exception.getLocalizedMessage());
	        ErrorMessage error = new ErrorMessage("Record Not Found", details);
	        return new ResponseEntity(error, HttpStatus.NOT_FOUND);
	   }
}
