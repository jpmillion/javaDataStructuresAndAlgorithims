package sort;

import java.util.Arrays;

public class SortAlgo {
	
	public static int[] mergeSort(int[] arr) {
		if (arr.length < 2) return arr;
		int mid = arr.length / 2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length + arr2.length];
		
		for (int i = 0, j = 0, k = 0; i < mergedArr.length; i++) {
			if (j < arr1.length && (k >= arr2.length || arr1[j] < arr2[k])) {
				mergedArr[i] = arr1[j++];
			} else {
				mergedArr[i] = arr2[k++];
			}
		}
		return mergedArr;
	}
	
	public static int[] quickSort(int[] arr) {
		if (arr.length < 2) return arr;
		
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) return;
		
		int pivot = start;
		int left = pivot+1;
		int right = end;
		
		while (left <= right) {
			if (arr[left] > arr[pivot] && arr[pivot] >= arr[right]) {
				swap(arr, left, right);
			}
			if (arr[left] <= arr[pivot]) left++;
			if (arr[right] > arr[pivot]) right--;
		}
		
		swap(arr, right, pivot);
		// quickSort on smaller half first
		if (end - (right + 1) < right - 1 - start) {
			quickSort(arr, right+1, end);
			quickSort(arr, start, right-1);
		} else {
			quickSort(arr, start, right-1);
			quickSort(arr, right+1, end);
		}
			
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
