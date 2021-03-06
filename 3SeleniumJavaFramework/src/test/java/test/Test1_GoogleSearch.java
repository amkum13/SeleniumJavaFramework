package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
	
		googleSearch() ;
		
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//goto the google.com
		driver.get("http://google.com/");
		
		//types Automation in search box
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		//hit the google search button
//		driver.findElement(By.name("btnK")).click();
		
		//if code doesn't lacate it maybe dure to auto suggestion try hitting enter button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
		
	}

}
