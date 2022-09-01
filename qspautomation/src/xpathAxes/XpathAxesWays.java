package xpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathAxesWays {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// url - https://money.rediff.com/losers/bse/daily/groupa
		driver.get("https://money.rediff.com/losers/bse/daily/groupa");

		// selfNode xpath
		String text = driver.findElement(By.xpath("//a[contains(text(),'Punj. NationlBak')]/self::a")).getText();
		Thread.sleep(2000);

		System.out.println("1st  "+text);
		// tr--> complte row
		// td---> its parent 
		// parent Xpath
		String text1 = driver.findElement(By.xpath("//a[contains(text(),'unj. NationlBak')]/parent::td")).getText();
		Thread.sleep(2000);
		System.out.println(text1);

		//child node xpath
		List<WebElement> text2 = driver.findElements(By.xpath("//a[contains(text(),'unj. NationlBak')]/ancestor::tr/child::td"));//.getText();
		Thread.sleep(2000);
		System.out.println(" child "+text2);
		System.out.println();

		// tr use for get all row data
		String text4 = driver.findElement(By.xpath("//a[contains(text(),'unj. NationlBa')]/ancestor::tr")).getText();
		Thread.sleep(2000);
		System.out.println(text4);

		// descendant  
		List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'unj. NationlBa')]/ancestor::tr/descendant::*"));
		System.out.println(descendant.size());

		// following
		List<WebElement> following = driver.findElements(By.xpath("List<WebElement> descendant = driver.findElements(By.xpath(\"//a[contains(text(),'unj. NationlBa')]/ancestor::tr/descendant::*\"));\r\n" + 
				"	System.out.println(descendant.size());"));
		System.out.println(following.size());



	}
}
