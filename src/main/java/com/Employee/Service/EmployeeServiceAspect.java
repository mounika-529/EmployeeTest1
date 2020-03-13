/*
 * package com.Employee.Service;
 * 
 * import org.aopalliance.intercept.Joinpoint; import
 * org.aspectj.lang.annotation.After; import org.aspectj.lang.annotation.Around;
 * import org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before; import
 * org.springframework.stereotype.Component;
 * 
 * import com.Employee.Domain.EmployeePojo;
 * 
 * @Component
 * 
 * @Aspect public class EmployeeServiceAspect {
 * 
 * 
 * 
 * @Before(value =
 * "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)"
 * ) public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
 * System.out.println("Before method:" + joinPoint.getSignature());
 * 
 * System.out.println("Creating Employee with name - " + name + " and id - " +
 * empId); }
 * 
 * 
 * @Before("execution(* com.Employee.Service.EmployeeService.*(..)) and args(employee)"
 * ) public void before(Joinpoint joinpoint,EmployeePojo employee)
 * 
 * { System.out.println("before allowed for exicution{}"+joinpoint); }
 * 
 * @Around("execution(* com.Employee.Service.*(..))") public void
 * around(Joinpoint joinpoint,EmployeePojo employeePojo)
 * 
 * { System.out.println("allowed for exicution{}"+joinpoint); }
 * 
 * @After("execution(* com.Employee.Service.*(..))") public void after(Joinpoint
 * joinpoint,EmployeePojo employeePojo)
 * 
 * { System.out.println("after allowed for exicution{}"+joinpoint); }
 * 
 * 
 * }
 * 
 */