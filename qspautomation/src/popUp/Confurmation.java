package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confurmation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Admin234/Desktop/Selnium%20Data/selenium%20HTML/confirmation.html");
	driver.findElement(By.xpath("//*[.='I am Hungry']")).click();
	 
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept(); 
	
	alert.dismiss();
}
}
