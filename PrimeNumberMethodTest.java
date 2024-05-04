import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the prime number finder method
 */
public class PrimeNumberMethodTest {

	/**
	 * Checks to see if a prime number (7) is prime and if a non-prime number (77) is not prime
	 */
	@Test
	public void testPrime() {
		assertTrue(PrimeNumberMethod.isPrime(7));
		assertTrue(!PrimeNumberMethod.isPrime(77));
	}

}
