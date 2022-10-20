package com.crm.vtiger2.testcases.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.ContactDetailsPageClass;
import ObjectRepository.CreateContactClass;
import ObjectRepository.HomePageClass;
import ObjectRepository.LoginPageClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingContactWDTest {

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
		String FNameDD=efu.readDataFromExcelFile("Sheet1",3, 1);
		String FName=efu.readDataFromExcelFile("Sheet1",4, 1);
		String LName=efu.readDataFromExcelFile("Sheet1",5, 1);
		driver.get(uRL);
		
        LoginPageClass lpc=new LoginPageClass(driver);
		
		lpc.login(uName, pWD);
		
		HomePageClass hpc=new HomePageClass(driver);
		hpc.getConButton().click();
		
		CreateContactClass ccc=new CreateContactClass(driver);
		ccc.getCreContact().click();
		
		ContactDetailsPageClass cdpc=new ContactDetailsPageClass(driver);
		cdpc.FirstDD(FNameDD);
		cdpc.fAndLName(FName, LName);
		cdpc.orgClick();
	
		
		String parentwin =wdu.switchToParent();
		wdu.allHandles(parentwin);
		
		WebElement searchTF=driver.findElement(By.id("search_txt"));
		searchTF.sendKeys("Rajaaaa");
		WebElement searchButton=driver.findElement(By.name("search"));
		searchButton.click();
		Thread.sleep(3000);
		WebElement selectOrg =driver.findElement(By.id("1"));
		selectOrg.click();
		Thread.sleep(3000);
		wdu.allHandles(parentwin);
		cdpc.sButton();
		
		Thread.sleep(3000);

	     hpc.getAdminImg().click();
	     
	     hpc.signOut(driver);
	     driver.close();

	}

	}
