package qq.zh.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties =new Properties();
		properties.load(new FileReader("dbcp.properties"));
		System.err.println(properties.getProperty("url"));
	}

}
