package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v101.browser.Browser;

public class TestInvlidAct extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	
	Flib flib=new Flib();
	int rc = flib.getRowCount("./data/TestDataAct.xlsx","invalidcreads");
	for (int i = 1; i <=rc; i++) {
		
	
	String username = flib.readExcelData("./data/TestDataAct.xlsx","invalidcreads", i, 0);
	String password=flib.readExcelData("./data/TestDataAct.xlsx","invalidcreads", i, 1);
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.className(username)).clear();
	}

}
}
