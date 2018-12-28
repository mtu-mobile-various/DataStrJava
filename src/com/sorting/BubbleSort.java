package com.sorting;

public class BubbleSort {
	
	static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		for(int i=0; i<size; i++) {
			for(int j=(size-1); i<j; j--) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,40,20,5,1};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("After Bubble Sort:");
		bubbleSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println();
	}

}
