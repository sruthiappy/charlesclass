package name1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hw3 extends BasePage
{
	@FindBy(xpath="//a//img[@width='250']")
	private List<WebElement> images;
	
	@FindBy(xpath="//h1//span[@class='heading-counter']")
	private WebElement product;
	
	public Hw3()
	{
		PageFactory.initElements(driver,this);
	}
	
	public int productcount()
	{
		String count=product.getText();
		String[] v=count.split(" ");
		int total=Integer.parseInt(v[2]);
		return total;
	}
	
	public int imagecount()
	{
		return images.size();
	}
	
}
