package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		//shortcut for printing entair table
		String s=driver.findElement(By.xpath("//table")).getText();
		System.out.println(s);
		
		//printing total matches played by india
		String s1=driver.findElement(By.xpath("//span[.='India']/parent::td/following-sibling::td[1]")).getText();
		System.out.println(s1);
		
		//for printing table
		List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement>col=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=1;j<=5;j++)
			{
				String data=driver.findElement(By.xpath("//table/tbody/tr[" +i+ "]/td[" +j+ "]")).getText();
				System.out.print(data+" ");
			}
			System.out.println(" ");
			
		}
		
		//for printing rownames
		List<WebElement>rows1=driver.findElements(By.xpath("//table/tbody/tr"));
		for(int i=1;i<=10;i++)
		{
			String data1=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(data1);
		}
		
	}

}
