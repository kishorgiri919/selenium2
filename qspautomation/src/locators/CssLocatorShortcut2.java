package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorShortcut2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.cssSelector("input[id$='xtUs']")).sendKeys("kishor");
	driver.findElement(By.cssSelector("input[id$='xtPass']")).sendKeys("ki113");
	driver.findElement(By.cssSelector("input[id$='tnLog']")).click();	
 }
}
 