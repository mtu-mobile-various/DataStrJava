package com.collections;
import java.util.*;

public class MyArrayList {

	
	public static void main(String[] args) {
		
		//Not good for too many add - remove operation
		ArrayList<Integer> ar= new ArrayList<Integer>();
		int a = 3;
		ar.add(a);
		ar.add(6);
		ar.add(7);
		ar.remove(1);
		
		for (Integer i : ar) {
			System.out.println(i);
		}
		

	}

}
