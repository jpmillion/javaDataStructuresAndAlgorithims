package testSort;

import static org.junit.Assert.*;

import org.junit.Test;

import sort.SortAlgo;

public class SortAlgoTest {
	
	@Test
	public void testMerge() {
		int[] a1 = {2, 3};
		int[] a2 = {-9, 4};
		
		int[] expected = {-9, 2, 3, 4};
		
		int[] actual = SortAlgo.merge(a1, a2);
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testMergeSort() {
		int[] actual = {98, -3, -1, -7, 87, 16, 24, 0};
		actual = SortAlgo.mergeSort(actual);
		
		int[] expected = {-7,-3,-1,0,16,24,87,98};
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testQuickSort() {
		int[] actual = {98, -3, -1, -7, 87, 16, 24, 0};
		actual = SortAlgo.quickSort(actual);
		
		int[] expected = {-7,-3,-1,0,16,24,87,98};
		
		assertArrayEquals(expected, actual);
		
		int[] actual2 = {8, -2, 4, 8, 7, -2, 4, 8};
		actual2 = SortAlgo.quickSort(actual2);
		
		int[] expected2 = {-2, -2, 4, 4, 7, 8, 8, 8};
		
		assertArrayEquals(expected2, actual2);
	}

}
