package testNg.pac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;

public class DataProviderUsingExcelFile {
	
 @Test(dataProvider="exceldata")
 public void getCred(String un,String pwd) {
	 System.out.println(un +"----->"+ pwd);
 }
 @DataProvider
 public Object [][]exceldata() throws Throwable{
	 Object arr[][]=new Object[4][2];
	 ExcelFileUtility excelFileUtility=new ExcelFileUtility();
	 for (int i=0;i<= excelFileUtility.getLastRowcount("Sheet2");i++) {
		 arr[i][0]=excelFileUtility.readDataFromExcelFile("Sheet2",i,0);
		 arr[i][1]=excelFileUtility.readDataFromExcelFile("Sheet2",i,1);
	 }
	 return arr;
 }
 
}
