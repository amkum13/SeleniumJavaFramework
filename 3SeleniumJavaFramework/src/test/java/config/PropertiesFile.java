package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;



import test.TestNGDemoWithPropertiesFile;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String projPlace = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();

	}
	
	public static void getProperties() {
			
		try {
			
			InputStream input = new FileInputStream(projPlace+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			TestNGDemoWithPropertiesFile.browserName = browser;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void setProperties() {
		
		try {
			
			OutputStream output = new FileOutputStream(projPlace+"\\src\\test\\java\\config\\config.properties");

			prop.setProperty("result", "Pass");
			prop.store(output, "can be any comments or null ");
			
		} catch (Exception e) { 
			
			e.printStackTrace();
		}
	}
}
