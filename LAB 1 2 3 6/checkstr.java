package vjit;

import java.util.Arrays;

public class checkstr
{
static String s1="vinay";

static boolean Alphabeticalorder (String s)
{
	int n= s.length();
	char c[]=new char[n];
	for (int i = 0; i < n; i++)
	{  
        c[i] = s.charAt(i);  
    }  
    Arrays.sort(c);  
    
    for (int i = 0; i < n; i++)  
        if (c[i] != s.charAt(i))   
            return false;  
      
    return true; 
}	
	public static void main(String[] args)
	{
		 if (Alphabeticalorder(s1))  
	           System.out.println("Positive String");  
	        else
	            System.out.println("Negative String");  
		}
		
		
		
	}

