package lab14;
import java.util.function.BiFunction;
import java.lang.Math;

public class LamPow {
	
	public static void main(String args[])
	{
		
	
		BiFunction<Integer, Integer, Double> obj=(a,b)->Math.pow(a,b);;
		
		int r=(int) Math.pow(2,3);
		System.out.println("The power of number--"+r);
	}
}