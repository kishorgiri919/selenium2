package practices;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class p2 {
// take ss

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	     TakesScreenshot ss=(TakesScreenshot) driver;
	     File source = ss.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshots/sss1.jpg");
	    Files.copy(source, dest);
	}
}
