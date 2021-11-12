package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeCheckTest {
	
	PrimeCheck obj = new PrimeCheck();
	
	@Test
	public void CheckPrime23() {
		Assert.assertTrue(obj.isPrime(23));
	}

	@Test
	public void CheckPrime1() {
		Assert.assertFalse(obj.isPrime(1));
	}
	
	@Test
	public void CheckPrime4() {
		Assert.assertFalse(obj.isPrime(4));
	}

	
}
