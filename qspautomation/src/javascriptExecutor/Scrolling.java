package javascriptExecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/flights/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1500)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(1500,0)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(-200,0)");
	js.executeScript("window.scrollBy(0,-200)");
}
}
