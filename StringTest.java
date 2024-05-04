import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for various string utility methods
 */
public class StringTest {
	
	/**
	 * Tests the length of a string.  "Sphinx of black quartz, judge my vow" contains 36 characters.
	 * @see testSubstring()
	 */
	@Test
	public void testLength() {
		
		assertEquals("Sphinx of black quartz, judge my vow".length(), 36);
	}
	
	/**
	 * Tests the ID of a character at an arbitrary index.  in this case, the sixth letter in 'Sphinx'
	 * @see testIndexOf()
	 */
	@Test
	public void testCharAt() {
		assertEquals("Sphinx of black quartz, judge my vow".charAt(5), 'x');
	}
	
	/**
	 * Tests the function to clip a string into a smaller string.
	 * @see testLength()
	 */
	@Test
	public void testSubstring() {
		assertEquals("Sphinx of black quartz, judge my vow".substring(7, 36), "of black quartz, judge my vow");
	}

	/**
	 * Tests the index of a character.  in this case, finds the index of the 'x' in 'Sphinx'.
	 * @see testCharAt()
	 */
	@Test
	public void testIndexOf() {
		assertEquals("Sphinx of black quartz, judge my vow".indexOf('x'), 5);
	}
}
