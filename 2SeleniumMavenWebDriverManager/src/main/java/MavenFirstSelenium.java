import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenFirstSelenium {

	public static void main(String[] args) {
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.iedriver().setup();
//		WebDriverManager.chromiumdriver().setup();
		
		driver.get("http://google.com/");
		
		driver.close();
		driver.quit();

		
		
		

	}

}