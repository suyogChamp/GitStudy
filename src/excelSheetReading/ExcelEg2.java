package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile=new File("C:\\Selenium\\myProject.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	    Cell myCell = mySheet.getRow(0).getCell(0);	
	    
	   // ya prakare apan purn syntax la divide karu shakato
	    
	    //aplya sheet madhe kontyahi type cha datatype asu shakato
	    // excel madhe 3 type che datatype astat (1)String (2)Numeric (3)boolean
	    
	    // jar aplyala excel madhe konta datatype ahe he mahit karun ghyayach aseltr aplyakade ek method ahe
	    
	    // getcelltype()
	    
	    CellType cell = myCell.getCellType();
	    
	    System.out.println(cell);
	    
	   myCell=mySheet.getRow(2).getCell(0);
	  System.out.println(myCell.getCellType());
	}

}
