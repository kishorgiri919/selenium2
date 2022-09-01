package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelDada(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();

		return data;
	}

	public int getRowcount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);  
		Workbook wb = WorkbookFactory.create(fis) ;
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();

		return rc;
	}

	public void writeDadaExcel(String excelPath,String sheetName,int rowcount,int cellcount,String data ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName); 
		Row row = sh.getRow(rowcount);
		Cell cell=row.createCell(cellcount);
		cell.setCellValue(data);

		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
	}

	public String readProprtFile(String propPath,String key) throws IOException {
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);

		return value;

	} 
}

