package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	Calculator obj = new Calculator();
	@Test
	public void TestAdd1() {
		Assert.assertEquals(10, obj.Add(6, 4));
	}
	
	@Test
	public void TestAdd2() {
		Assert.assertNotEquals(11, obj.Add(6, 4));
	}
}
