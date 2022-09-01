package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DelselectByindexMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin234/Desktop/multiselectdropdown.html");
	WebElement multiselcted = driver.findElement(By.id("menu"));
	Select sel= new Select(multiselcted);
	sel.selectByValue("v3");
	Thread.sleep(1000);
	sel.deselectByValue("v3");
}
}
