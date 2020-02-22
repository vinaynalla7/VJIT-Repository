package vjit;
import java.time.*;
public class checkdays1 {

	public static void main(String[] args) {
		 LocalDate d1 = LocalDate.of(2020, 02, 29);
	        LocalDate d2= LocalDate.of(2018,01,29);
	        System.out.println(d1);
	        System.out.println(d2);
	        
	        System.out.println("---------------");
	   	 
	   	 
	        Period diff = Period.between(d2, d1);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days \n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
		 
	}

}
