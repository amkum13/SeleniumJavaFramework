package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class UsingProperties {
	
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
//		setBrowser();  // setting browser from config file  make browserstring public and change in PropertiesFile.java
		
		PropertiesFile.readPropertiesFile();   //calling propertiesfile read method
		setBrowserConfig();
		testRun();
		PropertiesFile.writePropertiesFile();
		
	}
	
	public static void setBrowser() {
		browser = "Firefox";
	}
	
    public static void setBrowserConfig() {
    	String projectLocation = System.getProperty("user.dir");
    	System.out.println("In set browser function");
    	
    	if(browser.contains("Firefox")) {
    		System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
    		driver = new FirefoxDriver();
    		
    	}
    	if(browser.contains("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
    		driver = new ChromeDriver();
    		
    	}
	}
    
    public static void testRun() {
    	driver.get("http://google.com/");
		driver.quit();
	}
    

}