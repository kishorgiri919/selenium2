package webElementMethos10;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
    WebElement loginButton = driver.findElement(By.name("Submit")) ;
    Point point = loginButton.getLocation();
    int xaxis=point.getX();
    int yaxis=point.getY();
    System.out.println("the placement");
    System.out.println(xaxis);
    System.out.println(yaxis);


}
}
