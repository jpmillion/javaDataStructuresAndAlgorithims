package math;

public class MathAlgo {
	public static int fib(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Input should be positive");
		}
		
		int nMinusTwo = 0;
		int nMinusOne = 1;
		
		for (int i = 2; i < n; i++) {
			int temp = nMinusTwo;
			nMinusTwo = nMinusOne;
			nMinusOne += temp;
		}
		
		return nMinusOne + nMinusTwo;
	}
	
	public static long fac(long n) {
		
		if (n < 0) {
			throw new IllegalArgumentException("Input should be positive");
		}
		
		long product = 1;
		
		for (long i = n; i > 1; i--) {
			product *= i;
		}
		
		return product;
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		
		int squareRoot = (int) Math.sqrt((double) n);
		
		for (int i = 3; i <= squareRoot; i += 2) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
}
