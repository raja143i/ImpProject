package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("https://www.flipkart.com/");
		driver.findElement( By.xpath("//button[text()='✕']")).click();
		driver.findElement( By.xpath("//*[name()='svg'and@class='V3C5bO']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
