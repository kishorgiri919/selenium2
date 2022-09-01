package datadrivenPractice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelFilePath,String excelSheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(excelSheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
	    String data = cell.getStringCellValue();
	    return data;
	}
	
	public int getRowCount(String excelSheetPath,String excelSheetNaame) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelSheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(excelSheetNaame);
	    int rowCount= sheet.getLastRowNum();
		return rowCount;	
	}
	
	
}
