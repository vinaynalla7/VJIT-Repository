package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.service;

public class details {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id, name, salary of first employee");
		int id1=sc.nextInt();
		String name1=sc.next();
		double salary1=sc.nextDouble();
		
		Employee e1=new Employee();
		e1.setId(id1);
		e1.setName(name1);
		e1.setSalary(salary1);
		
		System.out.println("enter id, name, salary of second employee");
		int id2=sc.nextInt();
		String name2=sc.next();
		double salary2=sc.nextDouble();
		
		Employee e2=new Employee();
		e2.setId(id2);
		e2.setName(name2);
		e2.setSalary(salary2);
		
		
		service s=new service();

		System.out.println("employee 1 : ID="+e1.getId()+" \n NAME :"+e1.getName()+"\n SAL :"+e1.getSalary());
		s.calculate(salary1);
		System.out.println("employee 2 :ID"+e2.getId()+" \n NAME :"+e2.getName()+"\n SAL :"+e2.getSalary());
		s.calculate(salary2);

		
	}

}
