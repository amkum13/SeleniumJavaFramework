package test;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo2 {
	
	static WebDriver driver= null;
    
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearch2() {
				
		//goto the google.com
		driver.get("http://google.com/");
		
		
		//types Automation in search box
		driver.findElement(By.name("q")).sendKeys("TestNG");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//hit the google search button
		//driver.findElement(By.name("btnK")).click();
			
		//if code doesn't lacate it maybe dure to auto suggestion try hitting enter button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
		@Test
		public static void googleSearch3() {
					
			driver.get("http://google.com/");

			driver.findElement(By.name("q")).sendKeys("Maven");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) { 
				
				e.printStackTrace();
			}

			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) { 

				e.printStackTrace();
			}
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}

}