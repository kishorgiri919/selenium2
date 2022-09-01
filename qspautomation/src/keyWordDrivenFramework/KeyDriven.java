package keyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class KeyDriven {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Config.Properties");
		Properties prop = new Properties();
		prop.load(fis);
		String va = prop.getProperty("url");
		System.out.println(va);

}
}
