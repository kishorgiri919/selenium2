package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utube {
	public static void main(String[] args) {
		
		// maximize utube video
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		searchBox.click();
		searchBox.sendKeys("songs");
		driver.findElement(By.xpath("(//img[@id='img'])[13]")).click();
		driver.findElement(By.xpath("//*[@class='ytp-fullscreen-button ytp-button']")).click();
	}
}
