package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModularCode {
	
	static String browser;
	static WebDriver driver;

	
	public static void setBrowser() {
		browser = "Firefox";
	}
	
    public static void setBrowserConfig() {
    	String projectLocation = System.getProperty("user.dir");
    	
    	if(browser == "Firefox") {
    		System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
    		driver = new FirefoxDriver();
    		
    	}
    	if(browser.contains("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
    		driver = new ChromeDriver();
    		
    	}
	}
    
    public static void testRun() {
    	driver.get("http://seleniumhq.org/");
		driver.quit();
	}
    
	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		testRun();
		
	}
}
