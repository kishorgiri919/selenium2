package practices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	
/*	Actions act=new Actions(driver);
	WebElement s1 = driver.findElement(By.xpath("//div[@id='box6']"));
	WebElement t1 = driver.findElement(By.xpath("//div[@id='box107']"));
	
//	act.contextClick(s1).build().perform();
	//act.clickAndHold(s1).moveToElement(t1).release().build().perform();
act.dragAndDrop(s1, t1).build().perform();
	*/
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("//input[@role='searchbox' and @type='type']")).click();
	Robot robot=new Robot();
	for (int i = 0; i < 10; i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		if(i==8) {
			robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		}
	}
	
	
}
}
