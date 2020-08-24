package multiBrowserInParallel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowser {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser is : "+browserName);
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Thread id for chrome :"+Thread.currentThread().getId());
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("Thread id for firefox :"+Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("Test Completed");
//		driver.quit();
		
	}
}