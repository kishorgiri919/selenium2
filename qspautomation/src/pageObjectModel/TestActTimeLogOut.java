package pageObjectModel;

import java.io.IOException;

public class TestActTimeLogOut extends BaseTest{
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.OpenBrowser();
	LogInPage lp = new LogInPage(driver);
	Flib flib=new Flib();
	lp.validLoginActiTime(flib.readProprtFile(PROP_PATH, "username"), flib.readProprtFile(PROP_PATH, "password"));
	Thread.sleep(2000);
	HomePage hp = new HomePage(driver);
	hp.logoutActitime();
	
}
}
