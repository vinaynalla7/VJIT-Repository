package junit;
public class Date      
{
	int intDate, intMonth, intYear;
	Date(int intDate, int intMonth, int intYear)
	{
		this.intDate = intDate;
		this.intMonth = intMonth;
		this.intYear = intYear;
		}
	
	  public void setIntDate(int intDate) {
		this.intDate = intDate; 
		}  
	public int getIntDate( )  
	{
			return  this.intDate; 
			}
	public void setIntMonth(int intMonth)
	{
		this.intMonth = intMonth;
		} 

 public int getIntMonth( ) 
{
	return  this.intMonth;
	} 

public void setIntYear(int intYear) 
{ 
	this.intYear=intYear; 
	} 

public int getIntYear( )  
{
	return  this.intYear; 
}

}
