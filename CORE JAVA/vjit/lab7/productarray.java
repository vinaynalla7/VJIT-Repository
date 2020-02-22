package lab7;

import java.util.*;

public class productarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The Number of Products are");
		int n = sc.nextInt();
	    String[] array= new String[n];
	    for(int i=0;i<array.length;i++)
	    {
	    	array[i]=sc.next();
	    }
		
	    System.out.println("Products before the sorting are");
	    for(int i=0;i<array.length;i++) 
	    {
	    	System.out.println(array[i]);
	    }
	    
	    Arrays.sort(array);
	    
	    System.out.println("Products after sorting are");
	    for(int i=0;i<array.length;i++) 
	    {
	    	System.out.println(array[i]);
	    }
	}

}
