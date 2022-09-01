package lounchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///c:Users/QSP/Desktop/wcsa2htmldocs/checkbox.html");
		String sourcecodehtml=driver.getPageSource();
		System.out.println(sourcecodehtml);
			
	}

}
