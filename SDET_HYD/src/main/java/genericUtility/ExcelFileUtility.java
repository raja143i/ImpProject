package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	
	public String readDataFromExcelFile(String sheetNum,int rowNum,int cellNum) throws Throwable{
		FileInputStream fis=new FileInputStream("./commonData/commonD.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		 org.apache.poi.ss.usermodel.Sheet sn = wb.getSheet(sheetNum);
		Row rn=sn.getRow(rowNum);
		Cell cn=rn.getCell(cellNum);
		String value =cn.getStringCellValue();
		return value;
		
	}
         
	public int  getLastRowcount(String sheetNum) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./commonData/commonD.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		return wb.getSheet(sheetNum).getLastRowNum();
		
	}
	
	
}
