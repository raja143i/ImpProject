package com.crm.vtiger3.testcases.copy.copy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.ContactDetailsPageClass;
import ObjectRepository.CreateContactClass;
import ObjectRepository.HomePageClass;
import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;

public class CreateConTestNG extends BaseClass {
		
		@Test(groups="integration")
		public void creatingConTestNg() throws Throwable
		{
			WebDriverUtility webDriUtility = new WebDriverUtility(driver);
			
			ExcelFileUtility efu=new ExcelFileUtility();
			String FistDD =efu.readDataFromExcelFile("Sheet1", 3, 1);
			String FName =efu.readDataFromExcelFile("Sheet1", 4, 1);
			String LName =efu.readDataFromExcelFile("Sheet1", 5, 1);
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
			
			
			HomePageClass hpc=new HomePageClass(driver);
		     hpc.getConButton().click();
		    // ConPageClass cpc=new ConPageClass(driver);
		     CreateContactClass ccc=new CreateContactClass(driver);
		     ccc.getCreContact().click();
		     
		     ContactDetailsPageClass cdpc=new ContactDetailsPageClass(driver);
		     cdpc.FirstDD(FistDD);
				cdpc.fAndLName(FName, LName);
				cdpc.orgClick();
		    String parentwin =webDriUtility.switchToParent();
			webDriUtility.allHandles(parentwin);
			System.out.println(parentwin);
			 Set<String> allwinHan =driver .getWindowHandles();
			 for(String awindowhandles:allwinHan) {
				 driver.switchTo().window(awindowhandles);
				 System.out.println(awindowhandles);
			 }
			
			WebElement searchTF=driver.findElement(By.id("search_txt"));
			searchTF.sendKeys("raja");
			WebElement searchButton=driver.findElement(By.name("search"));
			searchButton.click();
			Thread.sleep(3000);
			WebElement selectOrg =driver.findElement(By.id("1"));
			selectOrg.click();
			Thread.sleep(3000);
			webDriUtility.allHandles(parentwin);
			cdpc.getSaveButton().click();
			
	       
		    
				}

	}

