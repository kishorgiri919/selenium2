package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ReferThis {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");

	/*
	// take screenshot of full screen
	TakesScreenshot tss=(TakesScreenshot) driver;
	File source = tss.getScreenshotAs(OutputType.FILE);
	File target=new File("./screenshots/ss1.jpg");
    Files.copy(source, target);
    */
	
/*	// screenshot of section
	WebElement sc = driver.findElement(By.xpath("//section[@id='td-cover-block-0']"));
	File source = sc.getScreenshotAs(OutputType.FILE);
	File target=new File("./screenshots/ss2.jpg");
	Files.copy(source, target);
	*/
	
	
	// screenshot of webelement 
	WebElement sc = driver.findElement(By.xpath("//img[@alt='Avo Automation']"));
	File source =sc.getScreenshotAs(OutputType.FILE);
	File target=new File("./screenshots/ss3.jpg");
	Files.copy(source, target);
	
	
	
	
	
	
}
}
