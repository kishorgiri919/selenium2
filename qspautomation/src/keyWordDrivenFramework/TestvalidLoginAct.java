package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestvalidLoginAct extends BaseTest{
	public static void main(String[] args) throws IOException {

		BaseTest bt=new BaseTest();
		bt.openBrowser();

		Flib flib=new Flib();
		String username = flib.readPropertyFile("./data/Config.Properties", "username");
		String password=flib.readPropertyFile("./data/Config.Properties", "password");
		driver.findElement(By.name("username")).sendKeys(username);  
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	
		
	}
}
