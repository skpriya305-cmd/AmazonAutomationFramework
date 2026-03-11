package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigUtils {
	static Properties prop;
	
	static
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/Users/skpri/eclipse-workspace/AmazonAutomation/Config.properties");
			 prop = new Properties();
				prop.load(fis);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static String ConfigReader(String key) {
		return prop.getProperty(key);
		
	}

}
