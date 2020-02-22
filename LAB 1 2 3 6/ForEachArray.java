package vjit;

public class ForEachArray {


	public static void main(String[] args) {
		
double[] myList= {1.9,2.9,3.4,3.5};

for(double element:myList) {
	System.out.println(element);
	
	char[] copyFrom= {'e','r','t','y','f','g','h'};
	char[] copyTo= new char[7];
	System.arraycopy(copyFrom,2,copyTo,0,5);
	System.out.println(new String(copyTo));
}
	}

}
