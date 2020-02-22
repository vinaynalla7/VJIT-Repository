package thread;

import java.io.FileReader;
import java.io.FileWriter;

public class FileProgram extends Thread 
{
	public static void main(String[] args)throws Exception 
	{
		FileReader fi = new FileReader("C:/Users/NALLA VINAY KUMAR/eclipse-workspace/source.txt");
		FileWriter fw = new FileWriter("C:/Users/NALLA VINAY KUMAR/eclipse-workspace/target.txt");
		CopyDataThread c = new CopyDataThread(fi,fw);
	}
}
