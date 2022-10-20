package com.crm.vtiger3.testcases.copy.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.HomePageClass;
import ObjectRepository.LoginPageClass;
import ObjectRepository.NewOrgPageClass;
import ObjectRepository.OrgInfoPageClass;
import ObjectRepository.OrgPageClass;
import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrgNameValidationWDTest extends BaseClass {
@Test
	public void orgvalidation() throws Throwable {
		
		WebDriverUtility wdu=new WebDriverUtility(driver);
		
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName =efu.readDataFromExcelFile("sheet1", 1, 1)+JavaUtility.generateRannum();
		String indName=efu.readDataFromExcelFile("Sheet1", 1, 2);
		
		
       
		
		HomePageClass hpc=new HomePageClass(driver);
		hpc.getOrgButton().click();
		
		OrgPageClass opc=new OrgPageClass(driver);
		opc.getCreOrg().click();
		
		NewOrgPageClass nopc=new NewOrgPageClass(driver);
		nopc.getOrgNameTF().sendKeys(orgName);
		
		Thread.sleep(2000);
		nopc.Industryname(indName);
        nopc.sButton();
        
        OrgInfoPageClass oipc=new OrgInfoPageClass(driver);
        
      Assert.assertEquals(orgName,oipc.Htext());
    
      
	   
}
	}