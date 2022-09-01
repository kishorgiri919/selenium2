package handlePropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDadaFromProperty {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/Config.Properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value = prop.getProperty("browser");
	System.out.println(value);
}
}
