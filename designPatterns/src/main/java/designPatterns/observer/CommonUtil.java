package designPatterns.observer;

import java.io.IOException;
import java.util.Properties;

public class CommonUtil {
	static Properties properties = new Properties();
	
	
	static {
		try {
			properties.load(ObserverClient.class.getClassLoader().getResourceAsStream("designPatterns/observer/listener.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperties(String key) {
		return properties.getProperty(key);
	}
}
