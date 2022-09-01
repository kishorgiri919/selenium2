package keyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	static WebDriver driver;
	public void openBrowser() throws IOException {

		Flib flib=new Flib();

		String browser = flib.readPropertyFile("./data/Config.Properties","browser");
		String url = flib.readPropertyFile("./data/Config.Properties", "url");
      
		if(browser.equalsIgnoreCase("chrome")) {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		}
		
		
	}
}
