package com.cg.eis.exception;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

class UnderSalaryException extends Exception{
	UnderSalaryException(String s)
	{
		super(s);
	}
}


public class EmployeeException extends Employee{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee a1= new Employee();
		System.out.println("Enter the Salary");
		double Salary1=sc.nextFloat();
		a1.setSalary(Salary1);
		
		try 
		       {
			
				if(a1.getSalary()<3000)
					throw new UnderSalaryException("Salary is less than 3000");
					
				else
						System.out.println("correct Salary");
				}
		
				catch(UnderSalaryException e)
		        {
					System.out.println("Exception caught "+e);
				}

			}
				

	}

