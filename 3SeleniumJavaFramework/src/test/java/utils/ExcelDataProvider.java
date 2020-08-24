package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	public WebDriver driver = null;
	
//	public static void main(String[] args) {
//		String excelpath = "C:\\Users\\AmitKumar\\SeleniumWorkSpaceJava\\3SeleniumJavaFramework\\excel\\data.xlsx";
//		testData(excelpath, "Sheet1");
//	}
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password) {
		System.out.println(username +" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//driver.findElement(By.name("Submit")).sendKeys(Keys.RETURN);
	}
	
	
	
	@DataProvider(name = "test1data")
	public Object[][] getData(){
		String excelpath = "C:\\Users\\AmitKumar\\SeleniumWorkSpaceJava\\3SeleniumJavaFramework\\excel\\data.xlsx";
		Object data[][] = testData(excelpath, "Sheet1");
		return data;
		
	}
	
	
	public static Object[][] testData(String excelPath, String sheetName) {
		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println(projectPath);
		ExcelUtilsData excel1 = new ExcelUtilsData(excelPath, sheetName);
			
		int rowCount = excel1.getRowCount();
		System.out.println(rowCount);
				
		int colCount = excel1.getColCount();
		System.out.println(colCount);
		
		Object[][] data = new Object[rowCount-1][colCount];
				
		for(int i=1; i<rowCount;i++) {
			
			   for(int j = 0; j<colCount;j++) {
				
				String cellData = excel1.getCellDataString(i,j);
				//System.out.print(cellData+"   ");
				data[i-1][j] = cellData;
			}
			System.out.println();
			
		}
		
		return data;
	}

}
