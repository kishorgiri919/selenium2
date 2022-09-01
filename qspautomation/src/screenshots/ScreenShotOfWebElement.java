package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	
	WebDriver driver=new ChromeDriver();
    TakesScreenshot ts=(TakesScreenshot)driver;
    
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/screenshot6.jpg");
	
	Files.copy(src, dest);
}
}
