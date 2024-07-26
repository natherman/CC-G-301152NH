package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testprogjunit {

	@Test
	public void testAddPositiveNumbers() {
		assertEquals(5, Calc.add(2, 3));
		assertEquals(100, Calc.add(20, 80));
	}

	@Test
	public void testAddNegativeNumbers() {
		assertEquals(-12, Calc.add(-2, -10));
		assertEquals(-12, Calc.add(-3, -9));
	}
	@Test
	public void testAddWithBoundaryValues() {
		
        assertEquals((double) (Integer.MAX_VALUE + 1), (double)- Calc.add(Integer.MAX_VALUE, 1), 0.0001);
        assertEquals((double) (Integer.MIN_VALUE - 1), Calc.add(Integer.MIN_VALUE, -1), 0.0001);
    }



}
