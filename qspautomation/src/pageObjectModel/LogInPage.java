package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
 
	// Decleration
	
	@FindBy(name="username") private WebElement username;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(xpath="//a[contains(text(),'Actimind')]") private WebElement linkActiTime;
	@FindBy(xpath="//a[contains(text(),'License')]") private WebElement licenseLink;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logoActiTime;
	
	
  //	initilazation
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

 // utilization
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}


	public WebElement getLinkActiTime() {
		return linkActiTime;
	}


	public WebElement getLicenseLink() {
		return licenseLink;
	}


	public WebElement getLogoActiTime() {
		return logoActiTime;
	}

  // operration method or bussiness logic
	
	public void validLoginActiTime(String validUsername,String validPassword)
	{
		username.sendKeys(validUsername);
		password.sendKeys(validPassword);
		loginButton.click();
		
	}
	
	public void invalidLoginActiTime(String invalidusername,String invalidPassword) throws InterruptedException
	{
		username.sendKeys(invalidusername);
		password.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(3000);
		username.clear();
	}
	
	
}
