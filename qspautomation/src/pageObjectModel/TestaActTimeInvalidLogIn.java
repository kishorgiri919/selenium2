package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestaActTimeInvalidLogIn extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
     BaseTest bt = new BaseTest();	
     bt.OpenBrowser();
     
     LogInPage lp = new LogInPage(driver);
     Flib flib=new Flib();
     
     int rc = flib.getRowcount(EXCEL_PATH, "invalidCreds");
     for (int i = 1; i <=rc; i++) {
    	String username = flib.readExcelDada(EXCEL_PATH, "invalidcreds", 1, 0);
     	String password = flib.readExcelDada(EXCEL_PATH, "invalidcreds", 1, 1);
   
		lp.invalidLoginActiTime(username, password);
	}
     bt.closeBrowser();
     
}
}
