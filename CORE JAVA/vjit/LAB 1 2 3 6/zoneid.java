package vjit;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class zoneid {
	public static void find(String a)
	{
		ZonedDateTime d= ZonedDateTime.now(ZoneId.of(a));
	System.out.println(d);
	}
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String a=s.nextLine();
	find(a);
	
	//ZonedDateTime Paris= ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	//System.out.println(Paris);
	//ZonedDateTime Australia= ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
	//System.out.println(Australia);
	

	}

}
