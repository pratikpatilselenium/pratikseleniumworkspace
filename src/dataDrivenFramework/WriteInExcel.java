package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WriteInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLibrary flib=new FileLibrary();
		flib.writeData("./data/TestData.xlsx", "Sheet1", 0, 2, "status");

	}

}
