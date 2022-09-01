
package lounchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class LoginInstgram {
		// Actitime
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://admin234-pc/login.do");
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("pwd")).sendKeys("admi123n");
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
		
		}
		

	}




