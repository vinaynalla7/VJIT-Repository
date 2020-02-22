package shop.mobilesales.details;

import java.sql.Date;

import shop.mobilesales.exception.PurchaseException;

public class Details 
{
	int purchaseid;
	String cname;
	String name;
	double price;
	int quantity;
	String mailid;
	String phoneno;
	Date purchasedate;
	int mobileid;
	
	public int getPurchaseid() 
	{
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) 
	{
		this.purchaseid = purchaseid;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public String getMailid() 
	{
		return mailid;
	}
	public void setMailid(String mailid) 
	{
		this.mailid = mailid;
	}
	public String getPhoneno() 
	{
		return phoneno;
	}
	public void setPhoneno(String phoneno) 
	{
		this.phoneno = phoneno;
	}
	public Date getPurchasedate() 
	{
		return purchasedate;
	}
	public void setPurchasedate(Date purchasedate) 
	{
		this.purchasedate = purchasedate;
	}
	
	public int getMobileid() 
	{
		return mobileid;
		
	}
	public void setMobileid(int mobileid) 
	{
		this.mobileid = mobileid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	

}
