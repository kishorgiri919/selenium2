package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssLocatorShortcut3 {
	
public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./driver/chromeDrver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[id='']")).sendKeys("kishor");
		driver.findElement(By.cssSelector("input[id$='']")).sendKeys("ki113");
		driver.findElement(By.cssSelector("input[id$='']")).click();	
	}
	}


