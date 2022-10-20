package com.crm.vtiger2.testcases.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.HomePageClass;
import ObjectRepository.LoginPageClass;
import ObjectRepository.NewOrgPageClass;
import ObjectRepository.OrgInfoPageClass;
import ObjectRepository.OrgPageClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrgNameValidationWDTest {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		PropertyFileUtility pFU=new PropertyFileUtility();
		String uRL =pFU.readDataFromPropertyFile("url");
		String uName =pFU.readDataFromPropertyFile("username");
		String pWD =pFU.readDataFromPropertyFile("password");
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName =efu.readDataFromExcelFile("sheet1", 1, 1)+JavaUtility.generateRannum();
		String indName=efu.readDataFromExcelFile("Sheet1", 1, 2);
		driver.get(uRL);
		
        LoginPageClass lpc=new LoginPageClass(driver);
		
		lpc.login(uName, pWD);
		
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
        
      
       if((oipc.Htext()).contains(orgName)) {
    	   System.out.println("validation succesfully");
       }
       else {
    	   System.out.println("validation failed");
       }
       
      
	     hpc.getAdminImg().click();
	     
	     hpc.signOut(driver);
	     driver.close();
}
	}