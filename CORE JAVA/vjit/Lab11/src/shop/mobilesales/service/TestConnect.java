package shop.mobilesales.service;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.Test;

public class TestConnect {

	@Test (expected = Exception.class)
	public void testInsert()throws Exception 
	{
		Date date = java.sql.Date.valueOf(LocalDate.now());
		Connect c = new Connect(1021,"NVK","125467","1562",date,1111);
		c.insertPurchaseDetal();
	}
	
	@Test(expected = Exception.class)
	public void testSelect()throws Exception
	{
		Date date = java.sql.Date.valueOf(LocalDate.now());
		Connect c = new Connect(1021,"NVK","125467","1562",date,1111);
		c.SearchMobile(2000, 5000);
	}

}
