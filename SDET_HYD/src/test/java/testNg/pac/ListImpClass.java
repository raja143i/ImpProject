package testNg.pac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListImpClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("This will execute when @test will start");
		
	}
 
	public void onTestSuccess(ITestResult result) {
		System.out.println("Good Job");
		System.out.println("This will execute when @test is gonna pass");
		
	}

	public void onTestFailure(ITestResult result) {
	   System.out.println(result.getThrowable()); 
	   TakesScreenshot ts=((TakesScreenshot) Amazon.driver);
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   File dest=new File("./Screenshot/"+result.getMethod().getMethodName()+".png");
	   try {
		   Files.copy(src, dest);
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This will execute when @test is gonna skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}
