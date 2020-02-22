package lab7;

import java.util.*;

public class Arraysort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mobile");
		al.add("Laptop");
		al.add("Table");
		al.add("Bucket");
		al.add("I-pod");
		
		System.out.println("Before sorting : \n The Products are");
		for(String str: al)
		{
			System.out.println(str);
		}
		
		Collections.sort(al);
		
		System.out.println("After sorting : \n The Products are");
		for(String str: al)
		{
		System.out.println(str);
		}
	//	 String domains[] = {"Practice", "Greeks", 
    //             "Code", "Quiz"}; 
	//	 List colList = new ArrayList(Arrays.asList(domains));
	//	 Collections.sort(colList);
	//	 System.out.println("List after the use of" +" Collection.sort()  :\n" + colList); 
	}

}
