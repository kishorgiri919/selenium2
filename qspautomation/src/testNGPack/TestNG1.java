package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	@Test
	public void a() {
		Reporter.log("mrthod a",true);
	}
	@Test
	public void  b() {
		Reporter.log("method b",true);
	}
	@Test
	public void c() {
		int i=2/0;
		
		Reporter.log("method c",true);

	}
	@Test
	public void d() {
		Reporter.log("method d",true);
	}
	@Test
	public void e() {
		Reporter.log("method e",true);
	}
	@Test
	public void f() {
		Reporter.log("method f",true);
	}



}
