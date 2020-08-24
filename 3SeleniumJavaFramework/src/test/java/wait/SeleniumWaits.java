package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {

	public static void main(String[] args) {
		
		seleniumWaits();

	}
	public static void seleniumWaits() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait applicable for entire session
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		//Explicit wait for specific element
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		
		//no such element --induced to see the implicit wait time
		driver.findElement(By.name("abc")).click();
		
		driver.close();
		driver.quit();
		
		
		
	}
}
