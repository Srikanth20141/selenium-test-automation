package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
	public static String get(String key) {
		
		if(prop == null) {
			prop = new Properties();
			try {
				FileInputStream file = new FileInputStream("src/test/resources/config.properties");
				prop.load(file);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return prop.getProperty(key);
	}

}
