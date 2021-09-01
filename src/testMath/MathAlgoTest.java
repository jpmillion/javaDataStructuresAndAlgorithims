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
	}

}
