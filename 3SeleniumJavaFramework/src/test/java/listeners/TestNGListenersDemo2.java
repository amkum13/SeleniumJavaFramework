package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo2 {
	 
	@Test
	 public void test4() {
		 System.out.println("In test Four");
	 }
	 @Test
	 public void test5() {
		 System.out.println("In test Five");
		 Assert.assertTrue(false); 
	 }
	 @Test
	 public void test6() {
		 System.out.println("In test Six");
		 throw new SkipException("This test skipped");
	 }
	 

}
