package vjit;

import java.time.LocalDate;
import java.time.Period;

public class personage {
	static String firstname="VinayKumar";
	static String lastname="Nalla";
	static String fullname;
    char gender;
personage()
{
firstname="Vinaykumar";
lastname="Nalla";
gender='M';
}
static void calculateage() {
	LocalDate bday = LocalDate.of(1998,12,16);
	LocalDate now=LocalDate.now();
	Period diff = Period.between(bday, now);
	System.out.println("Age="+diff.getYears()+"years");

}

	static void fullname()
	{
		fullname=firstname+lastname;
	System.out.println("fullname:"+fullname);
		
	}
personage(String firstname,String lastname,char gender)
{
this.firstname=firstname;
this.lastname=lastname;
this.gender=gender;
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
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}

public static void main(String[] args) {
	
calculateage();

fullname();

}

}
