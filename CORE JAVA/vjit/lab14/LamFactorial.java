package lab14;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class LamFactorial {
	int i=1;
	int count=1;
	int fact(int fact)
	{
		for(i=1;i<=fact;i++)
		{
			count=count*i;
		}
		System.out.println(count);
		return count;
	}
	public static void main(String args[])
	{	
		LamFactorial p=new LamFactorial();
		IntConsumer f=p::fact;
		f.accept(5);
		
	}
}
