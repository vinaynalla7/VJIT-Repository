package lab14;

import java.util.function.Consumer;

public class MethodRefField {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String args[])
	{
		MethodRefField m= new MethodRefField();
		Consumer<String> a=m::setName;
		a.accept("sharan patel");
		System.out.println(m.getName());
		
	}
}
@FunctionalInterface
interface Methodimp {
	public String setName(String s);
}
