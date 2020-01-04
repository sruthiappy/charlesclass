package name2;

import org.testng.Assert;
import org.testng.annotations.Test;
import name1.BasePage;
import name1.Objclass;

public class testclass 
{
	Objclass ob;
	BasePage bp;
	
	public  testclass()
	{
		ob=new Objclass();
		bp=new BasePage();
	}
	@Test
	public void verifyWomenpage() //is used to check whether is womenpage r not
	{
		Assert.assertTrue(ob.getwomenpage().isDisplayed());
	}
	@Test
	public void verifydresspage()
	{
		Assert.assertTrue(ob.getdresspage().isDisplayed());
	}
	@Test
	public void verifytshirtpage()
	{
		Assert.assertTrue(ob.gettshirtpage().isDisplayed());
	}
	@Test
	public void toclick()
	{
		ob.womenclick();
		Assert.assertTrue(ob.getTitlte().contains("Women"));
	
	
		ob.dressclick();
		Assert.assertTrue(ob.getTitlte().contains("Dresses"));
	
		ob.tshirtclick();
		Assert.assertTrue(ob.getTitlte().contains("T-shirts"));
	}
}
