package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePageClass;
import ObjectRepository.LoginPageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  WebDriver driver;
	public static WebDriver sdriver;
	
	PropertyFileUtility pFU=new PropertyFileUtility();
	@BeforeSuite(groups= {"smoke","intigration","regression"})
	public void dataBaseconnection() {
		
		System.out.println("dataBase connected");
		
	}
	@AfterSuite(groups= {"smoke","intigration","regression"})
	public void dataBaseDisconnected() {
		System.out.println("dataBase Disconnected");
		
	}
	@BeforeClass(groups= {"smoke","intigration","regression"})
	public void launchBrowser() throws Throwable {
		String browser=PropertyFileUtility.readDataFromPropertyFile("browser");
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		sdriver=driver;
	
		WebDriverUtility wdu =new WebDriverUtility(driver);
		String uRL =pFU.readDataFromPropertyFile("url");
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get(uRL);
		System.out.println("Browser opened");
		
		
		
	}
	@AfterClass(groups= {"smoke","intigration","regression"})
	public void closeBrowser() {
		driver.close();	
	}
	@BeforeMethod(groups= {"smoke","intigration","regression"})
	public void logintoApp() throws Throwable {
		
	
		
		String uName =pFU.readDataFromPropertyFile("username");
		String pWD =pFU.readDataFromPropertyFile("password");
		LoginPageClass loginPaClass = new LoginPageClass(driver);
		loginPaClass.login(uName, pWD);
	}
	@AfterMethod(groups= {"smoke","intigration","regression"})
	public void logout() {
		HomePageClass hpc=new HomePageClass(driver);
		 hpc.signOut(driver);	
	}

}
