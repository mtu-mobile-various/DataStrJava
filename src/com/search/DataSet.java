package com.search;

public class DataSet {
	int[] data;
	int count;

	public DataSet(int size) {
		data = new int[size];
		count = 0;
		for(int i=0; i<size; i++) 
			data[i] = i;	
	}
	
	public int getSize() {
		return data.length;
	}

	public int getCount() {
		return count;
	}

}
