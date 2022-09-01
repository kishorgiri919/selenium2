package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartAssingment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=0af2fba841d69de4a906bff13e7c79f5");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    

}
}
