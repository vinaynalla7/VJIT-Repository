package vjit;

public class personnew {
	String firstname;
	String lastname;
	char gender;
	long phoneno;
	
personnew()
{
firstname="Vinaykumar";
lastname="Nalla";
gender='M';
phoneno=9963999132L;
}
personnew(String firstname,String lastname,char gender,long phoneno)
{
this.firstname=firstname;
this.lastname=lastname;
this.gender=gender;
this.phoneno=phoneno;
}

public  void display()
{
	System.out.println("firstname:"+getFirstname());
	System.out.println("lastname:"+getLastname());
	System.out.println("gender:"+getGender());
System.out.println("phone number:"+getPhoneno());
}
public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
public char getGender() {
return gender;
}
public void setGender(char gender) {
this.gender = gender;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

public static void main(String[] args) {

}

		
	}

