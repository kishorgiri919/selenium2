package xparhLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopPrice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='_3U-Vxu']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='Brand']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='Type']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[.='2 in 1 Laptop']")).click();
		Thread.sleep(3000);

		String priceOfLap = driver.findElement(By.xpath("//div[.='HP Pavilion x360 Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14-dy0186TU 2 in 1 Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("The price of laptop is  "+priceOfLap);


	}
}
