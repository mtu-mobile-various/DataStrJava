package com.datastructures;

public class DynamicArrRun {
	public static void main(String[] args) {
		DynamicArr<Integer> arr = new DynamicArr<Integer>();
		arr.put(3);
		arr.put(4);
		arr.put(5);
		System.out.println("Size:"+ arr.getSize());
		for (int i=0;i<arr.getSize();i++)
			System.out.println(arr.getObj(i));
	}
}

