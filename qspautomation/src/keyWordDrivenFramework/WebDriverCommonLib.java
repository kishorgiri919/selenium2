package keyWordDrivenFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib extends BaseTest{

	// getAll option
	public void getAllOptionsOfDropDown(WebElement element) {
		Select sel=new Select(element) ;
		List<WebElement> allOps = sel.getOptions();
		for(WebElement op: allOps) {
			String textOfoption =op.getText();
			System.out.println(textOfoption);
		}	
	}
	public void rightClick(WebElement element) {

		Actions act=new Actions(driver);
		act.doubleClick(element).perform();	
	}
	
	public void mouseMover(WebElement target) {
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		}
	
	public void copyText() throws AWTException {
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	
	public void pasteText() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);	
		}
	
	public void takeScreenShot(String folder,String screnShotName) throws IOException {
	 TakesScreenshot sc=(TakesScreenshot)driver;
	 File src = sc.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./"+folder+"/"+screnShotName+".jpg");
	// com.google.common.io.Files.copy(src, dest);
	 }
	

}









