package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIndex {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin234/Desktop/Selnium%20Data/selenium%20HTML/user.html");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.id("un")).sendKeys("kishor");
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	driver.findElement(By.id("pwd")).sendKeys("kij1213");
	
	
}
}
