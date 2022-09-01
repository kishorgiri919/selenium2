package framePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Freame1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin234/Desktop/Selnium%20Data/selenium%20HTML/user.html");
	
	driver.findElement(By.id("un")).sendKeys("kishor");
	WebElement frameElement = driver.findElement(By.id("frid"));
	driver.switchTo().frame(frameElement);
	driver.findElement(By.id("pwd")).sendKeys("ki123");
	
}
}
