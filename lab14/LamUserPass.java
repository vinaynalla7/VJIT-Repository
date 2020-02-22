package lab14;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;;
public class LamUserPass {

//	private static String user;
//	private static String pwd;
//	public LamUserPass(String user,String pwd)
//	{
//		this.user=user;
//		this.pwd=pwd;
//	}
//	public void getDisplay(String user,String pwd)
//	{
//		System.out.println("enter the username--"+user);
//		System.out.println("enter the password--"+pwd);
//		
//	}
	public static void main(String args[])
	{ 	
		//LamUserPass tp=new LamUserPass(user,pwd);
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("enter user and pwd");
		BiFunction<String, String,Boolean> up =(user,pwd) -> {
			if(user=="sai" && pwd=="patel")
			{
				return true;
			}
			else
			{
				return false;
			}
		
		};
		
		//System.out.println("Entered username and PAssword are--"+up.apply(user,pwd));
		System.out.println("Entered username and PAssword are--"+up.apply("sai","patel"));
	}
}
