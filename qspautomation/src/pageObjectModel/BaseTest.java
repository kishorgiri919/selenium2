package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyWordDrivenFramework.IAutoConstant;


public class BaseTest implements IAutoConstant {

	static WebDriver driver;

	public void OpenBrowser() throws IOException {
		Flib flib=new Flib();
		String browserValue = flib.readProprtFile(PROP_PATH, "browser");
		String url = flib.readProprtFile(PROP_PATH, "url");
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	}

	public void closeBrowser() {
		driver.quit();	
	}
}
