package shop.mobilesales.service;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.io.*;

import oracle.jdbc.pool.OracleDataSource;
import shop.mobilesales.details.*;
import shop.mobilesales.exception.PurchaseException;
public class Connect 
{
	Details d=new Details();
	private int purchaseid;
	private String cname;
	private String phone;
	private Date date;
	private int mobileid;
	private String email;
	
	
	public Connect(int purchaseid, String cname,String phone,String email,Date date,int mobileid)
	{
		this.purchaseid=purchaseid;
		this.cname=cname;
		this.phone=phone;
		this.date=date;
		this.mobileid=mobileid;
		this.email=email;
	}

	
	
	public void insertPurchaseDetal()
	{
			 try 
			 {
				 Properties props = new Properties();
				 props.load(new FileInputStream("D:\\New folder\\connection.properties"));
				 Class.forName(props.getProperty("name"));
				 String url = props.getProperty("url");
				 String uname = props.getProperty("uname");
				 String pwd = props.getProperty("password");
				 Connection conn = DriverManager.getConnection(url,uname,pwd);
				 String query="SELECT quantity FROM mobiles where mobileid=?";
				 PreparedStatement pr= conn.prepareStatement(query);
				 pr.setInt(1, mobileid);
				 ResultSet rs= pr.executeQuery();
				 if(rs.next())
				 {
					int quantity=rs.getInt(1);
					d.setQuantity(quantity);
				 }			        
			 }
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
		     try 
		     {	
		    	 int quantity=d.getQuantity();
				 if(quantity>0)
				 {
					 Properties props = new Properties();
					 props.load(new FileInputStream("D:\\New folder\\connection.properties"));
					 Class.forName(props.getProperty("name"));
					 String url = props.getProperty("url");
					 String uname = props.getProperty("uname");
					 String pwd = props.getProperty("password");
					 Connection conn = DriverManager.getConnection(url,uname,pwd);
					 PreparedStatement pr=conn.prepareStatement("insert into purchasedetails values (?,?,?,?,?,?)");
					 pr.setInt(1, purchaseid);
					 pr.setString(2,cname);
					 pr.setString(3,email);
					 pr.setString(4,phone);
					 pr.setDate(5,date);
					 pr.setInt(6,mobileid);
					 int count=pr.executeUpdate();
					 System.out.println("--------------------------------");
					 System.out.println("Thanks for purchasing!!!!!");
					 System.out.println("Purchase Details successfully entered into database");
					 System.out.println("--------------------------------");
				  }
				  else
				  {
					  throw new PurchaseException("quantity cant  be below zero");
				  }
			}
		    catch (Exception e)
		    {
		    	System.out.println(e.getMessage());
		    }
		    try 
		    {
		    	Properties props = new Properties();
				 props.load(new FileInputStream("D:\\New folder\\connection.properties"));
				 Class.forName(props.getProperty("name"));
				 String url = props.getProperty("url");
				 String uname = props.getProperty("uname");
				 String pwd = props.getProperty("password");
				 Connection conn = DriverManager.getConnection(url,uname,pwd);
	        	PreparedStatement pr=conn.prepareStatement("update mobiles set quantity=quantity-1 where mobileid=?");
	        	pr.setInt(1, mobileid);
	        	int count1=pr.executeUpdate();
	        	System.out.println("--------------------------------");
	        	System.out.println("Quantity updated");
	        	System.out.println("--------------------------------");
	        	
	         }
		     catch (Exception e)
		     {
		    	 System.out.println(e.getMessage());
		     }
	}	

		
	
	public void SelectMobile()
	{
			
			try
			{
				Properties props = new Properties();
				 props.load(new FileInputStream("D:\\New folder\\connection.properties"));
				 Class.forName(props.getProperty("name"));
				 String url = props.getProperty("url");
				 String uname = props.getProperty("uname");
				 String pwd = props.getProperty("password");
				 Connection conn = DriverManager.getConnection(url,uname,pwd);
				Statement s= conn.createStatement();
				ResultSet rs= s.executeQuery("Select * from mobiles");
				System.out.println("Mobiles available are");
				System.out.println("--------------------------------");
				System.out.println("Id\tName\tPrice\tQuantity");
				System.out.println("--------------------------------");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				}
			} 
			catch (Exception e)
			{
				System.out.println("error");
			}
	}
	public void DeleteMobile(int mid)
	
	{
		try
		{
			Properties props = new Properties();
			props.load(new FileInputStream("D:\\New folder\\connection.properties"));
			Class.forName(props.getProperty("name"));
			String url = props.getProperty("url");
			String uname = props.getProperty("uname");
			String pwd = props.getProperty("password");
			Connection conn = DriverManager.getConnection(url,uname,pwd);
			PreparedStatement ps1 = conn.prepareStatement("delete from purchasedetails where mobileid= ?");
			ps1.setInt(1, mid);
			ps1.executeUpdate();
			PreparedStatement pr=conn.prepareStatement("delete from mobiles where mobileid=?");
			pr.setInt(1,mid);
			pr.executeUpdate();
			System.out.println("Mobile deleted successfully");
		}
		catch(Exception e)
		{
			System.out.println("Errro"+e.getMessage());
		}
		
	}


	public void SearchMobile(double range1, double range2)
	{
		try
		{
			Properties props = new Properties();
			props.load(new FileInputStream("D:\\New folder\\connection.properties"));
			Class.forName(props.getProperty("name"));
			String url = props.getProperty("url");
			String uname = props.getProperty("uname");
			String pwd = props.getProperty("password");
			Connection conn = DriverManager.getConnection(url,uname,pwd);
		
			PreparedStatement pr= conn.prepareStatement("Select mobileid,name,price,quantity from mobiles where price between ? and ?");
			pr.setDouble(1, range1);
			pr.setDouble(2,range2);
			ResultSet rs=pr.executeQuery();
			int price = rs.getInt(3);
			System.out.println("--------------------------------");
			System.out.println("The mobiles in your selected price range");
			System.out.println("--------------------------------");
			while(rs.next())
			{
				if(range1>=price && range2>=price && range1!=range2)
				{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				}
				else
				{
					throw new PurchaseException("please select a valid range");
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}