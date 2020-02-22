import java.util.*;
import java.io.*;
public class Property1 {

	public static void main(String[] args) throws Exception {

		Properties p=new Properties();	    
    	FileReader r=new FileReader("C:\\Users\\NALLA VINAY KUMAR\\eclipse-workspace\\Propertyfiles\\src/PersonProps.properties");
    	System.out.println("After Loading");
        p.load(r);
  	  System.out.println(p);
  	  System.out.println("\n Using getProperty() method");
  	 System.out.println("------------------------------");
  	  System.out.println(p.getProperty("Name"));
  	 System.out.println(p.getProperty("Roll_Number"));
  	 System.out.println(p.getProperty("clg_id"));
  	r.close();
	}

}
