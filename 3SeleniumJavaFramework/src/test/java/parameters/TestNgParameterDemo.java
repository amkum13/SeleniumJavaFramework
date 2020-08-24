package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterDemo {
	
	@Test
	@Parameters({"myName", "myAge"})
	public void test1(String name, @Optional ("25") int age) {
		System.out.println("My name is "+name +" and age is "+age);
	}

}
