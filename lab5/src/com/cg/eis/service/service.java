package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class service implements EmployeeService{
	Employee e=new Employee();
	@Override
	public void calculate(double salary)
	{
		if(salary>5000&& salary<20000)
		{
			e.setDesignation("System Associate");
			e.setInscheme("Scheme C");
			System.out.println("desig="+e.getDesignation());
			System.out.println("scheme="+e.getInscheme());
		}
		else if(salary>=20000&& salary<40000)
		{
			e.setDesignation("Programmer");
		e.setInscheme("Scheme B");
		System.out.println("desig="+e.getDesignation());
		System.out.println("scheme="+e.getInscheme());
		}
		else if(salary>=40000)
		{
			e.setDesignation("Manager");
		e.setInscheme("Scheme A");
		System.out.println("desig="+e.getDesignation());
		System.out.println("scheme="+e.getInscheme());
			
		}
		else
		{
			e.setDesignation("clerk");
			e.setInscheme("No Scheme");
			System.out.println("desig="+e.getDesignation());
			System.out.println("scheme="+e.getInscheme());
			
		}
		
			
	}
	
	
	
	public static void main(String[] args) {

	}

}
