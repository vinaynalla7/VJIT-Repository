package lab4;
import java.util.*;
public class SavingsAccount extends account {
 double balance;
 final double minbalance=500;
	@Override
 public void withdraw(double amount)
 {
	 if(getBalance()>=amount)
	 {
		 amount=getBalance()-amount;
		 if(amount>minbalance)
			 setBalance(amount);
		 System.out.println("The Balance is :"+getBalance());
		// else
			// System.out.println("Minimum Balance required is 500");
	 }
	 else
		 System.out.println("insufficient amount : Balance =\"+getBalance()");
		 
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SavingsAccount s1=new SavingsAccount();
		System.out.println("Enter Amount to be Deposited");
		double amount=sc.nextDouble();
		s1.deposit(amount);
		
		System.out.println("Enter Amount to be withdrawl");
		double amount1=sc.nextInt();
		s1.withdraw(amount1);

	}

}
