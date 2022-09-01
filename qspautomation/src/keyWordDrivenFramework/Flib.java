package keyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

	public String readExcelData(String excelSheetPath,String excelSheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelSheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(excelSheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data=cell.getStringCellValue();
		return data;
	}

	public int getRowCount(String excelSheetPath,String excelSheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelSheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(excelSheetName);
		int rc = sheet.getLastRowNum();      
		return rc;

	}

	public void writeExcelData(String excelSheetPath,String excelSheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelSheetPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(excelSheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos=new FileOutputStream(excelSheetPath);
		wb.write(fos);
	}

	public String readPropertyFile(String excelSheetPath,String key) throws IOException {
		FileInputStream fis=new FileInputStream(excelSheetPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}






}
