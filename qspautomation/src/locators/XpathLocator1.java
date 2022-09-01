package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("kshor");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("kishor123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
}
}
