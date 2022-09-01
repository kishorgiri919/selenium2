package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3Priority {
  @Test
  public void a() {
	Reporter.log("method a");  
  }
  @Test
  public void b() {
	  Reporter.log("method a");   
  }
  @Test(priority=1)
  public void c() {
	  Reporter.log("method a");  
  }
  @Test
  public void d() {
	  Reporter.log("method a");  
  }
  @Test
  public void e() {
	  Reporter.log("method a");   
  }
  @Test(priority=-1)
  public void f() {
	  Reporter.log("method a");  
  }
}
