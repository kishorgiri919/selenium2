package xparhLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWay2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// ---> //tagName[./='complete text value']
	  String text = driver.findElement(By.xpath("//span[.='( Username : Admin | Password : admin123 )']")).getText();
		
		System.out.println(text);
	}

}
