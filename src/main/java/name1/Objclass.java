package name1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objclass extends BasePage
{
	@FindBy(xpath="//li//a[@title='Women']")
	private  WebElement womenpage;
	
	@FindBy(xpath="(//li//a[@title='Dresses'])[2]")
	private WebElement dresspage;
	
	@FindBy(xpath="(//li//a[@title='T-shirts'])[2]")
	private WebElement tshirtpage;
	
	public Objclass() 
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getwomenpage() // used to take a link from women
	{
		return womenpage;
	}
	public WebElement getdresspage()
	{
		return dresspage;
	}
	public WebElement gettshirtpage()
	{
		return tshirtpage;
	}
    public void womenclick() //used to perform function of click
    {
    	 womenpage.click();
    	
    }
    public void dressclick()
    {
    	dresspage.click();
    }
    public void tshirtclick()
    {
    	tshirtpage.click();
    }
}
