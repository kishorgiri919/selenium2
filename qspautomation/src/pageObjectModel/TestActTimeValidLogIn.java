package pageObjectModel;

import java.io.IOException;

public class TestActTimeValidLogIn extends BaseTest {
public static void main(String[] args) throws IOException {
	BaseTest bt = new BaseTest();
	bt.OpenBrowser();
	LogInPage lp = new LogInPage(driver);
	Flib flib=new Flib();
	lp.validLoginActiTime(flib.readProprtFile(PROP_PATH, "username"), flib.readProprtFile(PROP_PATH, "password"));
}
}
