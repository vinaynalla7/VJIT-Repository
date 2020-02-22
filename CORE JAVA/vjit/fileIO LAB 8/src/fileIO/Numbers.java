package fileIO;
import java.io.*;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) throws IOException {

//		FileWriter fw=new FileWriter("D:/Number.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("/D:/Number.txt"));
		String data = null;
		while((data=br.readLine())!=null)
		{
			Scanner sc=new Scanner(data);
	     	sc.useDelimiter(",");
		
			while(sc.hasNext())
			{
			
				int n = Integer.parseInt(sc.next());
				if(n%2==0)
					System.out.print(n);
			}
			
		}
		br.close();
		// fw.close();
		 
		
}
}
