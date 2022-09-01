package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement sourse = driver.findElement(By.xpath("//*[@id=\"box3\"]"));

		WebElement target = driver.findElement(By.xpath("//div[.='South Korea']"));


		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(sourse, target).perform();	



	}
}
