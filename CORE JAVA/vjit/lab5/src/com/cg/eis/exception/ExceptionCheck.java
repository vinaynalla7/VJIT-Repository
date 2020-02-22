package com.cg.eis.exception;
import org.junit.Test;

import com.cg.eis.bean.Employee;

import static org.junit.Assert.*;


public class ExceptionCheck {

  
	 @Test (expected=UnderSalaryException.class)

	 public void check()
	     { 
		 Employee e=new Employee();
		 e.setSalary(6000);
		 }
	 
	
	/*
	 * public void expectUnderSalaryException() {
	 * System.out.println("Everything was fine here !!"); }
	 */	
}
