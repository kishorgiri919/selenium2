package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way4 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	EventFiringWebDriver efw=new EventFiringWebDriver(driver);
	
	File src=efw.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/screenshot4.jpg");
	Files.copy(src, dest);
}
}
