package practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("https://www.makemytrip.com/");
	  Date d=new Date();
	  String s=d.toString();
	  System.out.println(s);
	  
	  String[] arr =  s.split(" ");
	  String day=arr[0];
	  String month=arr[1];
	  String date1=arr[2];
	  String year=arr[5];
	  
	  String exp=day+" "+month+" "+date1+" "+year;
	  driver.findElement(By.className("langCardClose")).click();
	  driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+exp+"']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	  
	  

	}

}
