package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConditionalCommands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement userName = driver.findElement(By.xpath("//*[@id='txtUsername']"));
	WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
	Actions act =new Actions(driver);
	System.out.println(userName.isDisplayed());
	System.out.println(password.isDisplayed());
	System.out.println(password.isEnabled());
	System.out.println(userName.isEnabled());
	if(userName.isDisplayed() && userName.isEnabled()) {
		userName.sendKeys("Admin");
	}
	if(password.isDisplayed() && password.isEnabled()) {
		password.sendKeys("admin123");
	}
	
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	Thread.sleep(2000);
      WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
      WebElement useraman = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']']"));
      WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));

  	Thread.sleep(2000);

      
      act.moveToElement(admin).moveToElement(useraman).moveToElement(user).click().build().perform();
  	Thread.sleep(2000);

      WebElement checkBox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_56']"));
  	Thread.sleep(2000);

      if(checkBox.isDisplayed() && checkBox.isEnabled()) {
    	  if(checkBox.isSelected()) {
    		  checkBox.click();
    	  }
      }
      
      
      
      
      
      
      
      
      
      
	
}
}
