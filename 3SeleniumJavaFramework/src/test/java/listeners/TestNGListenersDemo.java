package listeners;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.SkipException;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	 
	@Test
	 public void test1() {
		 System.out.println("In test One");
	 }
	 @Test
	 public void test2() {
		 System.out.println("In test Two");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
			
			driver.get("http://google.com/");
			driver.findElement(By.name("q")).sendKeys("Automation");
			//fail deliberately
			driver.findElement(By.name("btn")).sendKeys("Automation");
			
			List <WebElement> inputElems = driver.findElements(By.xpath("//input"));	
			int count = inputElems.size();
			System.out.println(count);
			
			driver.close();
	 }
	 @Test
	 public void test3() {
		 System.out.println("In test Three");
		 throw new SkipException("This test skipped");
	 }
	 

}
