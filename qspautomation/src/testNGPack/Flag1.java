package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	
	@Test (description="what can i write")
	public void method1() {
		Reporter.log("description",true);
	}
}
