package com.crm.vtiger2.testcases.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.HomePageClass;
import ObjectRepository.LoginPageClass;
import ObjectRepository.NewOrgPageClass;
import ObjectRepository.OrgPageClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingOrgNameWDTest {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu =new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		PropertyFileUtility pFU=new PropertyFileUtility();
		String uRL =pFU.readDataFromPropertyFile("url");
		String uName =pFU.readDataFromPropertyFile("username");
		String pWD =pFU.readDataFromPropertyFile("password");
		
		ExcelFileUtility efu=new ExcelFileUtility();
		String orgName =efu.readDataFromExcelFile("sheet1", 2, 1)+JavaUtility.generateRannum();
		
		driver.get(uRL);

		
		LoginPageClass lpc=new LoginPageClass(driver);
		
		lpc.login(uName, pWD);
		 
		
		     HomePageClass hpc=new HomePageClass(driver);
		     hpc.getOrgButton().click();
		 
		     OrgPageClass opc =new OrgPageClass(driver);
		     opc.getCreOrg().click();
		     
		     NewOrgPageClass npc=new NewOrgPageClass(driver);
		     npc.orgTF(orgName);
		     npc.getSaveButton().click();
		     
		     Thread.sleep(3000);
		     
		     hpc.signOut(driver);
		     driver.close();
		     
}

	}


