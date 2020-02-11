public class Employee {
    String Empname;
    int Empid;
    float sal;
    Employee(){
    }
    Employee(String Empname,int Empid,float sal){
    this.Empname=Empname;
    this.Empid=Empid;
    this.sal=sal;
    }
    public void calculateSalary(){
    System.out.println("Employee salary:"+(sal+2000));
    }
public static void main(String[] args) {
// TODO Auto-generated method stub
     Employee e=new Employee();
     e.calculateSalary();
}
}


