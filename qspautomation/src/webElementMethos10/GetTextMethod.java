package webElementMethos10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement web1 = driver.findElement(By.xpath("//span[.='( Username : Admin | Password : admin123 )']"));
   String textOfweb1 = web1.getText();
   System.out.println(textOfweb1);


}
}
