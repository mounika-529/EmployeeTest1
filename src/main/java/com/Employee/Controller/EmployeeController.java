package com.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Domain.EmployeePojo;
import com.Employee.Exception.EmployeeNotFound;
import com.Employee.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/insert")
	public void insert(@RequestBody EmployeePojo emp) {
	
		System.out.println("entered into controller");
		employeeService.createEmployee(emp);
		System.out.println("data inserted");
	}
	
	@GetMapping("/getById/{employeeId}")
	public ResponseEntity<Object> getEmployeePojoById(@PathVariable("employeeId") int employeeId)  { 
		System.out.println("entered to excection");
		 EmployeePojo employee =employeeService.getEmployeePojoById(employeeId);
		 
	     
	      //System.out.println("ok");
	      if(employee.getEmpId()==employeeId) {
	    	 
	    	
	     
	      System.out.println("error completed");
	     return new ResponseEntity<>(employee, HttpStatus.OK);
	      }
	      System.out.println("error");
          throw new EmployeeNotFound ("Invalid employee id : "+employeeId);
        
	
		
		
}
}

