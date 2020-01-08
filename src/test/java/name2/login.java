package name2;

import org.testng.annotations.Test;

import name1.BasePage;
import name1.Hw3;
import name1.Objclass;

public class Hw3test
{
			BasePage bp;
			Hw3 hw;
			Objclass ob;
			
			public Hw3test()
			{
				bp=new BasePage();
				hw=new Hw3();
				ob=new Objclass();
			}
			
			@Test
			public void verifypagecount()
			{
				ob.womenclick();
				System.out.println(hw.imagecount());
				System.out.println(hw.productcount());
				
			}
			
			
}
