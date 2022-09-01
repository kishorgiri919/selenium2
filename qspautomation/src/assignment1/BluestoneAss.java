package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://bluestone.com/");
	
	driver.findElement(By.xpath("//span[.='Allow']")).click();
	Thread.sleep(2000);
	
	
	WebElement chatbox = driver.findElement(By.id("chat-widget"));
	driver.switchTo().frame(chatbox);
	//Thread.sleep(30000);
	driver.findElement(By.xpath("//p[.='Leave a message']")).click();
	
	
	driver.findElement(By.xpath("//*[@id='name']")).sendKeys("kisor");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kisor");
	driver.findElement(By.xpath("//input[@id='4ralldff0zl_3']")).sendKeys("987654321");
	driver.findElement(By.xpath("//*[@id='u5jlzryxxor_4']")).sendKeys("xyz");
	driver.findElement(By.xpath("//*[@id='rgd6d3cjpvf_5']")).sendKeys("abc");
	driver.findElement(By.xpath("//span[.='Leave a message']")).click();
}
}
