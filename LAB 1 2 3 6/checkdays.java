
package vjit;
import java.time.*; 

public class checkdays {
	
	   public static void main(String[] args)
	    {
	        LocalDate d1 = LocalDate.of(2019, 01, 30);
	        LocalDate d2= LocalDate.now();
	        System.out.println(d1);
	        System.out.println(d2);
	        
	        System.out.println("---------------");
	   	 
	   	 
	        Period diff = Period.between(d1, d2);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days \n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }


		

	}

