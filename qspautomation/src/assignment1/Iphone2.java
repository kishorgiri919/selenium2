package assignment1;


import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iphone2 {
	
	public static void main(String[] args) throws InterruptedException 
	{	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	driver.get("https://www.flipkart.com/");		
	String windowId = driver.getWindowHandle();	
	System.out.println("1st page title:"+driver.getTitle());	
	
	Thread.sleep(2000);	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();	
	driver.findElement(By.xpath("//*[.='APPLE iPhone 11 (Black, 64 GB)']")).click();
	Set<String> windowIds = driver.getWindowHandles();	
	for(String win:windowIds) {	
		String title = driver.switchTo().window(win).getTitle();
		//String s="CDwindow-1155CBDA534DEBF5F03B99099488A4DA";	
		System.out.println("2nd page title:"+driver.getTitle());	
		if (title.equals("APPLE iPhone 11 ( 64 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com"))
		{			Thread.sleep(2000);		
		driver.findElement(By.xpath("(//*[@class='_2C41yO'])[3]")).click();	
		driver.findElement(By.xpath("(//*[.='128 GB'])[1]")).click();	
		driver.findElement(By.xpath("//*[@class='_36yFo0']")).sendKeys("411035");	
		driver.findElement(By.xpath("(//*[.='Check'])[2]")).click();	
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@class='_1KOMV2']")).click();	
		Thread.sleep(5000);		
		driver.findElement(By.xpath("(//*[@class='_3dsJAO'])[2]")).click();	
		//driver.close();	
		}	
		}	
	
	
	}
		
		
	
	
}

