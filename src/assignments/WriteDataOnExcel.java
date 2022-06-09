package assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataOnExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/FlipkartLoginData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("FlipkartInvalidLoginCreds");
		Row rw = sh.createRow(9);
		rw.setRowNum(10);
		
		Cell cell = rw.createCell(0);
		cell.setCellValue("Pratik");
		
		
		FileOutputStream fos=new FileOutputStream("./data/FlipkartLoginData.xlsx");
		wb.write(fos);

	}

}
