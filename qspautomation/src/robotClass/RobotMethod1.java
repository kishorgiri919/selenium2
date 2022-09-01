package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMethod1 {

public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[.='OK' ]")).click();
	
     driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-')]")).click();
     Robot robot=new Robot();
     
     for (int i = 0; i <= 10; i++) {
      robot.keyPress(KeyEvent.VK_DOWN);
      if (i==10) {
    	  robot.keyPress(KeyEvent.VK_ENTER); 
		}
     }
     
     driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-47 ui-inputtext ui-widget ui-state-default ui')]")).click();
     
     
     for (int i = 0; i <= 10; i++) {
      robot.keyPress(KeyEvent.VK_DOWN);
      if (i==10) {
    	  robot.keyPress(KeyEvent.VK_ENTER); 
		}
     }
     
     driver.findElement(By.xpath
   ("//span[contains(@class,'ng-tns-c65-49 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted')]")).click();
     
     
     for (int i = 0; i <= 11; i++) {
      robot.keyPress(KeyEvent.VK_DOWN);
      if (i==11) {
    	  robot.keyPress(KeyEvent.VK_ENTER); 
		}
     }
   
     
     driver.findElement(By.xpath("//label[.='Railway Pass Concession']")).click();
     driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
     
     
     
     
     
     
     
	
     
     
     
	
	
	
}
}
