package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelements {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
WebDriverUtility wdu=new WebDriverUtility(driver);
wdu.maximize();
wdu.implicitlyWait();
driver.get("http://www.lenskart.com/");
driver.findElement(By.xpath("//input[@name='q']")).click();
List<WebElement>allnames=driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li/a"));
for (int i=0;i<allnames.size();i++)
{
	String s=allnames.get(i).getText();
	System.out.println(s);
	
}


 
		
		

	}

}
