package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPageClass 
{
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement Header;
	
	public OrgInfoPageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHeader()
	{
		return Header;
	}
	
	public String Htext()
	{
		return Header.getText();
	}
}
