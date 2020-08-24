package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		
		String projectPath= System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModdeSettings", true);
		caps.setCapability("ignoreZoomSetting", true);
		
		System.setProperty("webdriver.ie.driver",projectPath+"\\lib\\iedriver\\IEDriverServer.exe");
		
		
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Star Wars");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		
		

	}

}
