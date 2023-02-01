package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		

		File myfile=new File("C:\\Selenium\\myProject.xlsx");
		
       Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet2");
       
       
     //how to read whole row----->row is constant and cell is varying
       
       for(int i=0;i<=3;i++)
       {   
	String cricketers = mySheet.getRow(0).getCell(i).getStringCellValue();
       
       System.out.print(cricketers+" ");
       
       }
       System.out.println();     // he jar ith takal nst t yachya khalache sagalech statement ekach line madhe print zale aste
       System.out.println("=====================================================");
       
       
       // how to read whole cell/column----->cell is constant and row is varying
       for(int i=0;i<=4;i++)
       {  String cricketers = mySheet.getRow(i).getCell(0).getStringCellValue();
       
       System.out.println(cricketers+" ");
       }
       
       
       
       
       
       
	}

}
