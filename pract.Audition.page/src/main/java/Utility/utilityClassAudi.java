package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityClassAudi {
	
	public static String getExcelData(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\amol\\OneDrive\\Desktop\\testDataForSelenium.xlsx");
		Workbook book = WorkbookFactory.create(file);
		
		try {
			return book.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		}
		catch (IllegalStateException e) {
			
			double value = book.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
			String data = String.valueOf(value);
			return data;
		}
		
	}
	
}
