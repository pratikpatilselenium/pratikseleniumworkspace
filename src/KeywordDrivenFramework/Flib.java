package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readDataFromExcel(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
		
	}
	
	 public void writeDataInExcel(String excelPath,String sheetName,int rowNo,int cellNo,String value) throws EncryptedDocumentException, IOException
	 {
		FileInputStream fis=new FileInputStream(excelPath); 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.createRow(rowNo);
		
		Cell cell = rw.createCell(cellNo);
		cell.setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		 
		
	 }
	 
	 public String readPropertyFile(String propPath,String key) throws IOException
	 {
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	 }
	
	
	
	
	
	
	

}
