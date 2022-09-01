package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String Title = driver.getTitle();
		System.out.println("title  "+Title);

		String getUrl = driver.getCurrentUrl();
		System.out.println("Url of this page "+getUrl);

		String pageSourse = driver.getPageSource();
		System.out.println("page sourse  "+pageSourse);

		String getText = driver.findElement(By.xpath("//span[.='( Username : Admin | Password : admin123 )']")).getText();
		System.out.println("text of element   "+getText);









	}
}
