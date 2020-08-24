package wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {
	
	
	
	public static void main(String[] args) throws Exception {
		
		fluentWait();
	}

	public static void fluentWait() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		//calling in fluent wait
		//driver.findElement(By.className("LC20lb DKV0Md")).click();
		
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 
		       WebElement elem = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[10]/div/div[1]/a/h3"));
		       
		       if(elem.isEnabled()) {
		    	   System.out.println("Element found");
		       }
		       
		       return elem;
		     }
		   });
		   		foo.click();
		   		
		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

}
