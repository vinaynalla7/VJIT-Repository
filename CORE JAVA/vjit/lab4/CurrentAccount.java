package lab4;

import java.util.*;

public class CurrentAccount extends account{

double odlimit=-1000;
	@Override
	public void withdraw(double amount) {
		amount=getBalance()-amount;
	
	if(amount<0 && amount>=odlimit)
	{
			System.out.println("amount to be paid later "+amount);
	}
	else if(amount<0 && amount<odlimit)
		System.out.println("over draft limit exceeded");
	else
		System.out.println("rem bal:"+amount);
	}
	
	
	public static void main(String[] args)
	
	{
		
Scanner sc=new Scanner(System.in);
CurrentAccount c1=new CurrentAccount();

System.out.println("enter amount you want to deposit ");


double amount=sc.nextDouble();
c1.setBalance(amount);

System.out.println("available balance="+c1.getBalance());

System.out.println("enter amount you want to withdraw ");

double amount1=sc.nextDouble();
c1.withdraw(amount1);


	}


}
