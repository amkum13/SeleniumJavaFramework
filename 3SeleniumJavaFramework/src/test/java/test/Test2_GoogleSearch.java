package test;

import pages.GoogleSearchPage;  //importing the objects element class

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2_GoogleSearch{
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
	
		testgoogleSearch() ;
		
	}
	
	public static void testgoogleSearch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		
		//enter text
		GoogleSearchPage.testbox_search(driver).sendKeys("Automation");
		
		//hit enter button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
		
	}

}
