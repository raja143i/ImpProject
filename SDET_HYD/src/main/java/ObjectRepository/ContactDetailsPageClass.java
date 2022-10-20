package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericUtility.WebDriverUtility;

public class ContactDetailsPageClass {
	WebDriver driver;
	WebDriverUtility wdu=new WebDriverUtility(driver);
	@FindBy(name = "salutationtype")
	private WebElement nameType;
	
	@FindBy(name = "firstname")
	private WebElement fName;
	
	@FindBy(name = "lastname")
	private WebElement lName;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement selOrg;


	public ContactDetailsPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getNameType() {
		return nameType;
	}

	public WebElement getfName() {
		return fName;
	}
	
public void sButton(){
		
		saveButton.click();
	}
	

	public WebElement getlName() {
		return lName;
	}
	
	public WebElement getSelOrg() {
		return selOrg;
	}
	
	
	public void FirstDD(String Ftext)
	{
		Select select =new Select(nameType);
		select.selectByVisibleText(Ftext);
	}
	
	public void fAndLName(String fName1, String lName1) {
		fName.sendKeys(fName1);
		lName.sendKeys(lName1);
	}
//	public void lastName(String lName1) {
//		lName.sendKeys(lName1);
//	}
	public void orgClick() {
		selOrg.click();
	}
	
	
}
