package testSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import sort.SortAlgo;

public class SortAlgoTest {
	
	@Test
	public void testMerge() {
		int[] a = {2, 3};
		int[] b = {-9, 4};
		
		int[] c = {-9, 2, 3, 4};
		
		int[] d = SortAlgo.merge(a, b);
		
		assertArrayEquals(c, d);
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
		fail("Not yet implemented");
	}

}
