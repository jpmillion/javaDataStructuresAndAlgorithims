package testSearch;

import static org.junit.Assert.*;

import org.junit.Test;

import search.SearchAlgo;

public class SearchAlgoTest {

	@Test
	public void testBinarySearch() {
		int[] arr1 = {-90, -50, -40, 0, 3, 6, 10, 20, 30, 40};
		
		int actual = SearchAlgo.binarySearch(arr1, -40);
		assertEquals(2, actual);
		
		actual = SearchAlgo.binarySearch(arr1, 20);
		assertEquals(7, actual);
		
		actual = SearchAlgo.binarySearch(arr1, -90);
		assertEquals(0, actual);
		
		actual = SearchAlgo.binarySearch(arr1, 40);
		assertEquals(9, actual);
		
		actual = SearchAlgo.binarySearch(arr1, -1000);
		assertEquals(-1, actual);
		
		actual = SearchAlgo.binarySearch(arr1, 1000);
		assertEquals(-1, actual);
	}

}
