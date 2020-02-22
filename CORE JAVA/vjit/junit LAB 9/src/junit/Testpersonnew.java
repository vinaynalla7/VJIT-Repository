package junit;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class Testpersonnew {
	@Test
	public void getStringFirstname()
	{
	personnew d=new personnew("Vinaykumar","Nalla",'M',9963999132L);
	assertEquals(d.getFirstname(),"Vinaykumar");
	}
	@Test
	public void getStringLastname()
	{
	personnew d=new personnew("Vinaykumar","Nalla",'M',9963999132L);
	assertEquals(d.getLastname(),"Nalla");
	}
	@Test
	public void getcharGender()
	{
	personnew d=new personnew("Vinaykumar","Nalla",'M',9963999132L);
	assertEquals(d.getGender(),'M');
	}
	@Test
	public void getLongPhoneno()
	{
	personnew d=new personnew("Vinaykumar","Nalla",'M',9963999132L);
	assertEquals(d.getPhoneno(),9963999132L);
	}
	
	@Test
	public void display() {
		personnew d=new personnew("Vinaykumar","Nalla",'M',9963999132L);
		assertEquals(d.getFirstname(),"Vinaykumar");
		assertEquals(d.getLastname(),"Nalla");
		assertEquals(d.getGender(),'M');
		assertEquals(d.getPhoneno(),9963999132L);
		
	}
	
}
