package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Actions act=new Actions(driver);

		WebElement adminEle = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement useman   = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement user     = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));


   // mouse over 
		act.moveToElement(adminEle).moveToElement(useman).moveToElement(user).click().build().perform();






	}

}
