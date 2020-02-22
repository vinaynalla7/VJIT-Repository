package lab4;

import java.util.Scanner;

public class account extends person {
	
	private long Accno=101;
	private double balance;
	
	public long getAccno() {
		
		return Accno;
	}

	public void setAccno(long accno) {
		accno+=1;
		
		this.Accno = accno;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double damount)
	{
		balance=balance+damount;
		setBalance(balance);
	}
	public void withdraw(double wamount )
	{
		balance=balance-wamount;
		setBalance(balance);
	}
	public String toString()
	{
		return getName()+" "+getAge()+" "+getAccno()+" "+getBalance()+"";
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Name and Deposit Amount and Age");
		String name=sc.nextLine();
		double amount=sc.nextDouble();
		int age=sc.nextInt();
		
		account a1=new account();
		a1.setName(name);
		a1.setBalance(amount);
		a1.setAge(age);
		a1.setAccno(a1.Accno);
		
		System.out.println("Next Name and Amount and Age");
		
		String name1=sc.next();
		double amount1=sc.nextDouble();
		int age1=sc.nextInt();
		
		account a2=new account();
		a2.setName(name1);
		a2.setBalance(amount1);
		a2.setAge(age1);
		a2.setAccno(a1.Accno);
		
		System.out.println("deposit 2000 in acc1....so enter 2k");
		double amount2=sc.nextDouble();
		a1.deposit(amount2);
		
		System.out.println("withdraw 2k from acc2");
		double amount3=sc.nextDouble();
		a2.withdraw(amount3);
		
		System.out.println("balance in "+a1.getName()+ "account is "+a1.getBalance());
		System.out.println("balance in " +a2.getName() +"account is "+a2.getBalance());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		

	}

}
