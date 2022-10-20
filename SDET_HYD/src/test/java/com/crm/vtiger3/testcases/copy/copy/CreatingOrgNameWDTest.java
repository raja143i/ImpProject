package com.crm.vtiger3.testcases.copy.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.HomePageClass;
import ObjectRepository.LoginPageClass;
import ObjectRepository.NewOrgPageClass;
import ObjectRepository.OrgPageClass;
import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingOrgNameWDTest extends BaseClass {
@Test
	public void classcreatingorgnameTestNG() throws Throwable  {
		
		WebDriverUtility wdu =new WebDriverUtility(driver);
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName =efu.readDataFromExcelFile("sheet1", 1, 1)+JavaUtility.generateRannum();
		
		     HomePageClass hpc=new HomePageClass(driver);
		     hpc.getOrgButton().click();
		 
		     OrgPageClass opc =new OrgPageClass(driver);
		     opc.getCreOrg().click();
		     
		     NewOrgPageClass npc=new NewOrgPageClass(driver);
		     npc.orgTF(orgName);
		     npc.getSaveButton().click();
		     Thread.sleep(2000);
		  
		   
		    
}

	}


