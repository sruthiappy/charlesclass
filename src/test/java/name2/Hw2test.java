package name2;

import org.testng.Assert;
import org.testng.annotations.Test;

import name1.BasePage;
import name1.Hw2;

public class Hw2test
{
		BasePage bp;
		Hw2 hw;
		
		public Hw2test()
		{
			bp=new BasePage();
			hw=new Hw2();
		}
		@Test
		public void verifyWomenpage() //is used to check whether is womenpage r not
		{
			Assert.assertTrue(hw.getwomenpage().isDisplayed());
		}
		@Test
		public void verifysmall()
		{
			Assert.assertTrue(hw.getsmall().isDisplayed());
		}
		@Test
		public void verifymedium()
		{
			Assert.assertTrue(hw.getmedium().isDisplayed());
		}
		@Test
		public void verifylarge()
		{
			Assert.assertTrue(hw.getlarge().isDisplayed());
		}
}
