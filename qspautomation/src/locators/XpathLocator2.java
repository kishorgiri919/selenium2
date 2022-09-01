package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//span[.='( Username : Admin | Password : admin123 )']")).sendKeys("kishor");
	driver.findElement(By.xpath("")).sendKeys("kiosr123");
	driver.findElement(By.xpath("")).click();

}
} 
