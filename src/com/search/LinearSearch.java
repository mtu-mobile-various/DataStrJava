package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		DataSet arr = new DataSet(10000);
		int findNumber = -200;
		boolean isFound = false;
		for(int i=0; i<arr.getSize(); i++) {
			arr.count++;
			if(arr.data[i]==findNumber) {
				System.out.println("found after "+arr.count+" search");
				isFound = true;
			}else if(i==arr.getSize()-1 && !isFound)
				System.out.println("Cant find it");
				
		}
	}

}
