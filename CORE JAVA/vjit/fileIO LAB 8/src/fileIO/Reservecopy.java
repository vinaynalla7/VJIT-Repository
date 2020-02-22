package fileIO;
import java.util.*;
import java.io.*;

public class Reservecopy {

	public static void main(String[] args) {
		try 
		{
			FileReader ip=new FileReader("/D:/copy.txt");
			ArrayList<Character> a1=new ArrayList<Character>();
			FileWriter op=new FileWriter("/D:/copyrev.txt");
			int c;
			while((c=ip.read())!= -1)
			
			{
				a1.add((char)c);
			}
		//	System.out.println(a1);
			Collections.reverse(a1);
			//System.out.println(a1);
			for(int i:a1)
			{
				op.write(i);
			}
ip.close();
op.close();
		}
catch(Exception e) {
	System.out.println("no file "+e);
}
	}

}
