package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//Step1-: Create FileINInputStream Object.
	 FileInputStream fis= new FileInputStream("./TestData/TestScriptData.xlsx");
		
	//Step2-:  Create respective file type object.
	 Workbook wb = WorkbookFactory.create(fis);
	  
	//Step3-: Call read Methods.  
	 String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	 System.out.println(url);
	 
	  int price = (int) wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
	  System.out.println(price);
	    
	  boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
	  System.out.println(status);
	  
	  LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
	  System.out.println(date.getDayOfMonth());
	  System.out.println(date.getMonth());
	  System.out.println(date.getYear());
	}

}
