package lab10;

import java.sql.*;
import java.util.Scanner;
public class Empjdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try
{
	char ch='y';
	
	
	PreparedStatement pst=null;
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Class.forName("oracle.jdbc.driver.OracleDriver");
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	Connection con=DriverManager.getConnection(url,"system","root");
	con.setAutoCommit(true);
	System.out.println("enter the details");
	Scanner br1=new Scanner(System.in);
	System.out.println("do you want to insert.....(y/n)");
	ch=br1.next().charAt(0);
	while(ch=='y'||ch=='Y')
	{
		//con =DriverManager.getConnection(url,"system","root");
		
		pst =con.prepareStatement("insert into emp1 values(?,?,?,?)");
		System.out.println("Enter id");
		int i=br1.nextInt();
		//br1.next();
		
		System.out.println("Enter name");
		String n=br1.next();
		System.out.println("Enter sal");
		int s=br1.nextInt();
		System.out.println("Enter desig");
		String d=br1.next();
		pst.setInt(1, i);
		pst.setString(2, n);
		pst.setInt(3, s);
		pst.setString(4, d);
		
		pst.executeUpdate();
		System.out.println("1 row inserted");
		System.out.println("do you want to count.....(y/n)");
		ch=br1.next().charAt(0);	
	}
	System.out.println("-----------------");
	Statement stmt = con.createStatement();
	String query ="select * from emp1";
	ResultSet rs=stmt.executeQuery(query);
	System.out.println("id\tname\tsalary\t\tdesignation\n");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t"+rs.getString(4));
	}
	System.out.println("do you want to delete.....(y/n)");
	ch=br1.next().charAt(0);
	while(ch=='y'||ch=='Y')
	{
		pst =con.prepareStatement("delete from emp1 where id=?");
		System.out.println("Enter id");
		int i1=br1.nextInt();
		pst.setInt(1, i1);
		pst.executeUpdate();
		System.out.println("1 row deleted");
		System.out.println("do you want to count.....(y/n)");
		ch=br1.next().charAt(0);
		
	}
	System.out.println("-----------------");
	//Statement stmt = con.createStatement();
	String query1 ="select * from emp1";
	ResultSet rs1=stmt.executeQuery(query1);
	System.out.println("id\tname\tsalary\t\tdesignation\n");
	while(rs1.next())
	{
		System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t\t"+rs1.getInt(3)+"\t"+rs1.getString(4));
	}
	stmt.close();
	con.close();
}
catch(Exception e)
{
	System.out.println("Error is"+e);
}
	}
}

