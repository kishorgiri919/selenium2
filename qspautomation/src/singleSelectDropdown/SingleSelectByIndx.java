package singleSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectByIndx {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/Admin234/Desktop/Selnium%20Data/selenium%20HTML/singleselectdropdown.html");
	WebElement ss = driver.findElement(By.id("menu"));
	Select ss1= new Select(ss);
	ss1.selectByIndex(5);
}
}
