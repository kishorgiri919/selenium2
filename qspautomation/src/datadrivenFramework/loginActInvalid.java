package datadrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginActInvalid {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://admin234-pc/login.do");	
	
    Flib flib = new Flib();
    
    
    
    int rc = flib.getRowcount("./data/TestDataAct.xlsx", "invalidcreds");
    
    for (int i = 1; i <= rc; i++) {
    
	String username=flib.readExcelDada("./data/TestDataAct.xlsx", "invalidcreds", i, 0);
	String password=flib.readExcelDada("./data/TestDataAct.xlsx", "invalidcreds", i, 1);
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).clear();
          
    }	
}
}
