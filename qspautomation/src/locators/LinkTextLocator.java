package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");

	System.setProperty("webdriver.chrome.driver","./drivers.chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin234/Desktop/flipkartlink.html");
	driver.findElement(By.linkText("click here to launch flipkart")).click();
	
}
}
