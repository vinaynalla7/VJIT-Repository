package vjit;

public class string {
  static String s1 = "vinay";
  public static void op(String s1) {
		 
	  String s4=s1;
	    int n = s4.length();
	    for(int i=0;i<n;i+=2)
	    {
	    	char ch=s1.charAt(i);
	    	char c=Character.toUpperCase(ch);
	    	s4=s4.replace(s1.charAt(i), c);
	    }
	    		 System.out.println(s4);
  }
  
	public static void  main (String[] args) {
		
		String s2= s1.concat(s1);
		System.out.println(s2);
		op(s1);
		String s3="";
		
	    for(int i=0; i<s1.length(); i+=2)
	    {
	    	s3=s1.substring(0, i);
	        s3= s3+'#';
	        s3= s3+ s1.substring(i+1);
	        s1=s3;
	    }
	    System.out.println(s1);
	    
}
	
}

