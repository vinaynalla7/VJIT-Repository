package junit;

import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

@Test
public void setIntDate()
{
Date d=new Date(20,07,1998);
assertEquals(20,d.getIntDate());
}
@Test
public void setIntMonth()
{
Date d=new Date(20,07,1998);
assertEquals(07,d.getIntMonth());
}
@Test
public void setIntYear()
{
Date d=new Date(20,07,1998);
assertEquals(1998,d.getIntYear());
}
@Test
public void getIntDate()
{
Date d=new Date(20,07,1998);
assertEquals(d.getIntDate(),20);
}
@Test
public void getIntMonth()
{
Date d=new Date(20,07,1998);
assertEquals(d.getIntMonth(),7);
}
@Test
public void getIntYear()
{
Date d=new Date(20,07,1998);
assertEquals(d.getIntYear(),1998);
}
/*
* @Test public void test() { fail("Not yet implemented"); }
*/

}
