package assignment1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool;

public class IphoneAssi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	String fistWindow = driver.getWindowHandle();
	
	System.out.println(driver.switchTo().window(fistWindow).getTitle());
	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	driver.findElement(By.xpath
			("//div[@class='_4rR01T' and text()='APPLE iPhone 11 (Black, 64 GB)']")).click();
	Set<String> windows = driver.getWindowHandles();
	
	for(String allwindows: windows) {
		String title = driver.switchTo().window(allwindows).getTitle();
		System.out.println(title);
		if (title.equals("APPLE iPhone 11 ( 64 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com")) {
			driver.findElement(By.xpath("(//img[@class='q6DClP'])[2]")).click();
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
