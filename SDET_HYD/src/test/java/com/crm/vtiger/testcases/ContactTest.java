package com.crm.vtiger.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("http://localhost:8888/");
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password =driver.findElement(By.name("user_password"));
		password.sendKeys("admin");
		WebElement loginButton=driver.findElement(By.id("submitButton"));
		 loginButton.click();
		 WebElement conButton=driver.findElement(By.linkText("Contacts"));
		 conButton.click();
		 WebElement plusButton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		 plusButton.click();
		 WebElement nameDD=driver.findElement(By.name("salutationtype"));
		 Select select=new Select(nameDD);
		 select.selectByValue("Mr.");
		 WebElement firstnameTf=driver.findElement(By.name("firstname"));
		 firstnameTf.sendKeys("Bahubali");
		 WebElement lastnameTf=driver.findElement(By.name("lastname"));
		 lastnameTf.sendKeys("Amarendra");
		 WebElement selectorg=driver.findElement(By.xpath("//img[@title='Select']"));
		 selectorg.click();
		 String parentwin =driver.getWindowHandle();
		 System.out.println(parentwin);
		 Set<String> allwinHan =driver .getWindowHandles();
		 for(String awindowhandles:allwinHan) {
			 System.out.println(awindowhandles);
			 driver.switchTo().window(awindowhandles);
		 }
		 WebElement orgSearchTf =driver.findElement(By.name("search_text"));
		 orgSearchTf.sendKeys("Rajaaa");
		 WebElement searchButton =driver.findElement(By.name("search"));
		 searchButton.click();
		 WebElement SelectGGc=driver .findElement(By.linkText("Rajaaa"));
		 SelectGGc.click();
		 driver.switchTo().window(parentwin);
		 WebElement saveButton =driver.findElement(By.name("button"));
		 saveButton.click();
		 Thread.sleep(2000);
		 WebElement adminImg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		 Actions action =new Actions(driver);
		 action.moveToElement(adminImg).perform();
		 WebElement signOut=driver.findElement(By.linkText("Sign Out"));
		 signOut.click();
		 
		  driver.close();
	}

	}
