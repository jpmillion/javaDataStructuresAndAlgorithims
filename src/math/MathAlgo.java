package math;

public class MathAlgo {
	public static int fib(int n) {
		int nMinusTwo = 0;
		int nMinusOne = 1;
		
		for (int i = 2; i < n; i++) {
			int temp = nMinusTwo;
			nMinusTwo = nMinusOne;
			nMinusOne += temp;
		}
		
		return nMinusOne + nMinusTwo;
	}
}
