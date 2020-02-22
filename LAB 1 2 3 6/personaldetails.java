package vjit;

public class personaldetails {
String firstName;
String lastName;
char gender;
short age;
double weight;

personaldetails()
{
	firstName="Divya";
	lastName="Bharathi";
	gender='F';
	age=20;
	weight=85.55;	
}
	public static void main(String[] args) {
		personaldetails p1=new personaldetails();
		System.out.println("firstName:" +p1.firstName);
		System.out.println("lastName:" +p1.lastName);
		System.out.println("gender:" +p1.gender);
		System.out.println("age:" +p1.age);
		System.out.println("weight:" +p1.weight);
	}

}
