package vjit;
import java.util.*;

import lab4.account;

class UnderAgeException extends Exception{
	UnderAgeException(String s)
	{
		super(s);
	}
}

public class TestException1 extends account
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		account a1= new account();
		System.out.println("Enter the Age");
		float age1=sc.nextFloat();
		a1.setAge(age1);
		
		try 
		       {
			
				if(a1.getAge()<15)
					throw new UnderAgeException("Age is less than 15");
					
				else
						System.out.println("correct age");
				}
		
				catch(UnderAgeException e)
		        {
					System.out.println("Exception caught "+e);
				}

			}
				
	}

