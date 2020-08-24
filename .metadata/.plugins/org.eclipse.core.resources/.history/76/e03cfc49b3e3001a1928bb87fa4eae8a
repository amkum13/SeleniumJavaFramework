package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		
		String projectLocation = System.getProperty("user.dir");
		
// for firefox driver 		
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
		//after setProperty if it doesn't work we must install latest firefox and
		//set property for the firefox exe which this code will launch
//System.setProperty("webdriver.firefox.bin", "location of firefox.exe");
//      its always better to run automatin on a separate browser
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new MarionetteDriver();
		driver.get("http://seleniumhq.org/");
		driver.close();
		
		
		
// for chrome driver 
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://seleniumhq.org/");
		browser.close();
	}

	
}
