package priority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority= 0)
	public void test1() {
		System.out.println("In test 1");
	}
	
	@Test(priority= 9)
	public void test2() {
		System.out.println("In test 2");
	}
	
	@Test(priority= -2)
	public void test3() {
		System.out.println("In test 3");
	}

}
