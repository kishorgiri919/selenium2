package xparhLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='0']")).click();
		driver.findElement(By.xpath("//span[.='0']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[.='+']")).click();

		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.='5']")).click();
		driver.findElement(By.xpath("//span[.='0']")).click();

		driver.findElement(By.xpath("//span[.='=']")).click();

		String output = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("the output is "+output);

	}
}
