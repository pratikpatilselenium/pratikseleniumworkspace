package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {

	public  String readData(String pathName,String sheetName,int rowData,int cellData) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(pathName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row rw = sheet.getRow(rowData);
		Cell cell = rw.getCell(cellData);
		String data = cell.getStringCellValue();
		return data;

	}
	public int getRowCount(String pathname,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(pathname);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		
		return rowCount;
	}
	
	
	public void writeData(String pathName,String sheetName,int rowCount,int cellCount,String setValue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(pathName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowCount);
		Cell cell = rw.createCell(cellCount);
		cell.setCellValue(setValue);
		
		
		FileOutputStream fos=new FileOutputStream(pathName);
		wb.write(fos);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
