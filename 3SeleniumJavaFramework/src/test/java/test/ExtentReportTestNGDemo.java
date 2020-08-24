package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTestNGDemo {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	static ExtentTest test1;
	private static WebDriver driver= null;
	
	@BeforeSuite
	public void setUp() {
		
				htmlReporter = new ExtentHtmlReporter("extent.html");
		        extent = new ExtentReports();
		        extent.attachReporter(htmlReporter);
		        		        
		       
	}
	
	@BeforeTest
	public void setUpTest() {
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	@Test
	public void testNg_One() throws Exception {
		
		test1 = extent.createTest("Google Search Test One", "Google Test Descrition1");

        test1.log(Status.INFO, "Test one started");
		
		driver.get("http://google.com/");		
		test1.pass("Naviagted to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");	
		test1.pass("Search box populated with automation");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		driver.findElement(By.name("btnK")).click();	
		test1.pass("Google Search button clicked");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}	
		test1.info("Test One completed successfully");
	}

	@Test
	public void testNg_Two() throws Exception {
		
		test1 = extent.createTest("Google Search Test Two", "Google Test Descrition2");

        test1.log(Status.INFO, "Test two started");
		
		driver.get("http://google.com/");		
		test1.pass("Naviagted to google.com");
		
		driver.findElement(By.name("q")).sendKeys("TestNG");	
		test1.pass("Search box populated with TestNG");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Enter button pressed");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}	
		test1.info("Test Two completed successfully");
	}
	
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Browser closed successfully");
				
	}
	
	@AfterSuite
	public void tesrDown() {
		extent.flush();
	}
}
