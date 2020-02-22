package vjit;

import java.time.LocalDate;

public class warantee {

	public static void main(String[] args) {
		LocalDate purchase=LocalDate.of(2019,01, 20);
		int warantyyear = 3;
		int warantymonths= 6;
		System.out.println("Purchase Date = "+purchase);
		System.out.println("Waranty = " +warantyyear+"years and "+warantymonths+"months");
		
		LocalDate s= purchase.plusMonths(warantymonths);
	
		System.out.println("The Waranty will expire on = "+s.plusYears(warantyyear));
		

	}

}
