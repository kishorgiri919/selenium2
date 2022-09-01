package webDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommands {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	System.out.println("1st  "+driver.getTitle());
	
	driver.navigate().to("https://jqueryui.com/slider/");
	System.out.println("2nd  "+driver.getTitle());
	
	driver.navigate().back();
	System.out.println("3rd  "+driver.getTitle());
	
  driver.navigate().forward();
  System.out.println("4rt  "+driver.getTitle());
  
  driver.navigate().refresh();
  
  
}
}
