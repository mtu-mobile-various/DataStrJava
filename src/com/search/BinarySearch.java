package com.search;

public class BinarySearch {
	
	static int binarySearch(int[] arr, int first, int last, int wanted) {
		if(last>=first) {
			int mid = first + ((last-first)/2);
			if(arr[mid]==wanted)
				return mid;
			if(arr[mid]<wanted) {
				return binarySearch(arr, mid+1, last, wanted);
			}
			return binarySearch(arr, first, mid-1, wanted);
		}
		return -1;
	}

	public static void main(String[] args) {
		DataSet arr = new DataSet(10000);
		int findNumber = 500;
		int result = binarySearch(arr.data, 0, arr.getSize(), findNumber);
		if(result == -1)
			System.out.println("Cant find it");
		else
			System.out.println("Element is in the index: " + result);

	}

}
