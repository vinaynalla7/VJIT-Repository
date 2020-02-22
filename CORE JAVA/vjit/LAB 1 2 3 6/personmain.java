package vjit;

public class personmain {

	public static void main(String[] args) {
	person p=new person("vinaykumar","Nalla",'M');
	System.out.println("firstname:" +p.getFirstname());
	System.out.println("lastname:" +p.getLastname());
	System.out.println("gender:" +p.getGender());
	System.out.println("-------------------");

	

	person p1=new person();
	System.out.println("firstname:" +p1.getFirstname());
	System.out.println("lastname:" +p1.getLastname());
	System.out.println("gender:" +p1.getGender());
	System.out.println("-------------------");

}
}
