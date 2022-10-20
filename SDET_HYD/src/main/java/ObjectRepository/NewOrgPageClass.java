package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewOrgPageClass {
	@FindBy(name="accountname")
	private WebElement orgNameTF;
	
	@FindBy(name="industry")
	private WebElement IndDD;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	public NewOrgPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgNameTF() {
		return orgNameTF;
	}

		public WebElement getIndDD()
		{
			return IndDD;
		}
		
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void orgTF(String OrgText) {
		orgNameTF.sendKeys(OrgText);
	}
	
	public void Industryname(String IndText)
	{
		Select select =new Select(IndDD);
		select.selectByVisibleText(IndText);
	}
	public void sButton(){
		
		saveButton.click();
	}
	
}
