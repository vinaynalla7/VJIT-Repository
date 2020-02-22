package lab14;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class LamWordSpace {

	public static void main(String args[])
	{
		String s="sai";
	
		Supplier<String> s1=()->s.replace(""," ").trim();
		System.out.println(s1.get());
	}
}
