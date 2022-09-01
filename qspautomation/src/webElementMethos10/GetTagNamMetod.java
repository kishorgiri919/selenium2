package webElementMethos10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNamMetod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	WebElement searchBox = driver.findElement(By.name("q"));
   String TagName = searchBox.getAttribute("title");
   System.out.println(TagName);
}
}
