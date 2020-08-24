package dependencies;


import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups= {"sanity.*"})
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@Test(groups = {"sanity3"})
	public void test3() {
		System.out.println("This is test 3");
	}
	
//	@Test(dependsOnGroups= {"sanity1"})
//	public void test1() {
//		System.out.println("This is test 1");
//	}
//	
//	@Test(groups = {"sanity1"})
//	public void test2() {
//		System.out.println("This is test 2");
//	}
//	
//	@Test
//	public void test3() {
//		System.out.println("This is test 3");
//	}
	
//	@Test(dependsOnMethods = {"test2", "test3"}, priority = 1)
//	public void test1() {
//		System.out.println("This is test 1");
//	}
//	
//	@Test(priority = 2)
//	public void test2() {
//		System.out.println("This is test 2");
//	}
//	
//	@Test
//	public void test3() {
//		System.out.println("This is test 3");
//	}
	

}
