package getWindowHandle_s;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String first = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	
	Set<String> Windows = driver.getWindowHandles();
	Iterator<String> itr=Windows.iterator();
	Thread.sleep(2000);
	
	for(String win:Windows) {
		String title = driver.switchTo().window(win).getTitle();
		System.out.println(title);
		if (title.equals("Basic Web Page Title")) {
			Thread.sleep(2000);
			driver.close();
		}
	}
	
	
	
/*	while(itr.hasNext()) {
	String window = itr.next();
	driver.switchTo().window(window);
	if (driver.equals("Basic Web Page Title")) {
		Thread.sleep(2000);

		driver.close();
	}
	}
	
	Thread.sleep(2000);
	driver.switchTo().window(first);
	driver.findElement(By.name("q")).sendKeys("kishor");*/
	
}
}
