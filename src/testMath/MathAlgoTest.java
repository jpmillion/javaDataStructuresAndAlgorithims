package testMath;

import static org.junit.Assert.*;

import org.junit.Test;

import math.MathAlgo;

public class MathAlgoTest {

	@Test
	public void testFib() {
		assertEquals("should equal 13", 13, MathAlgo.fib(7));
		assertEquals("should equal 1", 1, MathAlgo.fib(1));
		assertEquals("should equal 1", 1, MathAlgo.fib(2));
		
		assertThrows(IllegalArgumentException.class, () -> {
			MathAlgo.fib(-2);
		});
	}
	
	@Test
	public void testFac() {
		assertEquals("should equal 120", 120, MathAlgo.fac(5));
		assertEquals("should equal 720", 720, MathAlgo.fac(6));
		assertEquals("should equal 1", 1, MathAlgo.fac(1));
		assertEquals("should equal 1", 1, MathAlgo.fac(0));
		
		assertThrows(IllegalArgumentException.class, () -> {
			MathAlgo.fac(-2);
		});
	}

	@Test
	public void testIsPrime() {
		assertEquals("should be true", true, MathAlgo.isPrime(13));
		assertEquals("should be false", false, MathAlgo.isPrime(25));
		assertEquals("should be false", false, MathAlgo.isPrime(0));
		assertEquals("should be true", true, MathAlgo.isPrime(23));
	}
}
