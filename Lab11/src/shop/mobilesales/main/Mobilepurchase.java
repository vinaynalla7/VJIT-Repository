package shop.mobilesales.main;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import shop.mobilesales.exception.PurchaseException;
import shop.mobilesales.service.*;

public class Mobilepurchase 
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter phone");
		String phone =sc.nextLine();
		System.out.println("enter mobile id");
		int mobileid=sc.nextInt();
		System.out.println("enter purchase id");
		int purchaseid=sc.nextInt();
		Date date = java.sql.Date.valueOf(LocalDate.now());

		Connect c=new Connect(purchaseid,name,phone,email,date,mobileid);
		System.out.println("Menu:");
		System.out.println("1.Insert values and update quantity");
		System.out.println("2.View available mobiles");
		System.out.println("3.Delete a mobile");
		System.out.println("4.View mobiles based on range");
		System.out.println("----------------------------");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
		 case 1: c.insertPurchaseDetal();
		 			break;
		 case 2: c.SelectMobile();
		 			break;
		 case 3:	System.out.println("Enter the mobile id you want to delete:");
					int mid = sc.nextInt();
					c.DeleteMobile(mid);
					break;
		 case 4:   double r1,r2;
			       System.out.println("Enter the minimum price:");
			       r1 = sc.nextDouble();
			       System.out.println("Enter the maximum price:");
			       r2 = sc.nextDouble();
			       c.SearchMobile(r1, r2);
			       break;
		default: break;
		}
		
		
	}
	

}
