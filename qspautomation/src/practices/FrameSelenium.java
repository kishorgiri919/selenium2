package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSelenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview.html");
	
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[.='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//span[.='Alert']")).click();
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	driver.findElement(By.xpath("(//a[.='Help'])[1]")).click();
	
	
	
}
}
