package operationalMethodDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedOperationException {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/Admin234/Desktop/Selnium%20Data/selenium%20HTML/singleselectdropdown.html");
	
	Thread.sleep(3000);
	WebElement ssdropdown = driver.findElement(By.id("menu"));
	Select sel=new Select(ssdropdown);
	
	sel.selectByVisibleText("misal");
	Thread.sleep(3000);
	sel.deselectAll();
}
}
