package xparhLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWay3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwz96WBhC8ARIsAATR251IYE4jPjMEY2y2CSMAFcON57KFv_95kHzyGD_edxrSAyBy3CFyY-kaAlAEEALw_wcB%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D9304071%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D1523793200791101743%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	//==> //tagName[contains(@attribute,'complate_Attribute')]
	String text = driver.findElement(By.xpath("//label[contains(@class,'a-form-label')]")).getText();
	System.out.println(text);
}
}
