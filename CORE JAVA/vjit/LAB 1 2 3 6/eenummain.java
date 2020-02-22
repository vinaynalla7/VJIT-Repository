package vjit;

import vjit.eenum.Gender;

public class eenummain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
eenum d= new eenum();
d.display();
System.out.println("--------------------");
eenum r= new eenum("hello","vinay",Gender.M,9963999132L);
r.display();
	}

}
