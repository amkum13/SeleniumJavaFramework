package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjectMAdv;

   

public class Test3_GoogleSearchPageObjectMAdv {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearchTest();

	}
	
	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		GoogleSearchPageObjectMAdv searchPageObj = new GoogleSearchPageObjectMAdv(driver);
		
		driver.get("http://google.com/");
		
		System.out.println("Text Entering");
		
		searchPageObj.setTextInSearchBox("Automate");
		
		System.out.println("Text Entered");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
		driver.quit();
	}

}
