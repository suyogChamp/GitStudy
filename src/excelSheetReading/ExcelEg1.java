package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		File myfile=new File("C:\\Selenium\\myProject.xlsx");
		
		String excel = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(excel);
		
		
	}

}
