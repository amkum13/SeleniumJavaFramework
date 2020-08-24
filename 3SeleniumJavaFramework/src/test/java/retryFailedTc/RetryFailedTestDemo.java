package retryFailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTestDemo {
	
	@Test()
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test()
	public void test2() {
		System.out.println("This is test 2");
		//int i = 1/0;
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	public void test3() {
		System.out.println("This is test 3");
		Assert.assertTrue(0>1); 
	}

}
