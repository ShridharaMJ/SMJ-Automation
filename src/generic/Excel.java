package generic;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getCellValue(String path,String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String v="";
		FileInputStream file=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(file);
		Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
		v=c.toString();
		
		return v;
		
	}
	public static int getRowCount(String path,String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		int rc=0;
		
		
			FileInputStream file=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(file);
			rc=wb.getSheet(sheet).getLastRowNum();
			
		
		
		return rc;
	}
}
