package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2Enable {
  @Test
  public void a() {
	  Reporter.log("a");
  }
  @Test(enabled=false)
  public void b() {
	  Reporter.log("b");
  }
  @Test
  public void c() {
	  Reporter.log("c");
  }
}
