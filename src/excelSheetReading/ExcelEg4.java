package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile=new File("C:\\Selenium\\myProject.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		
		//how to read whole sheet 
		
		for(int row=0;row<=1;row++)
		{
			for(int cell=0;cell<=2;cell++)
			{
				double values = mySheet.getRow(row).getCell(cell).getNumericCellValue();
				System.out.print(values+" ");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
