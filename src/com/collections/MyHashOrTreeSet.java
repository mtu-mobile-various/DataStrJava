package com.collections;
import java.util.*;

public class MyHashOrTreeSet {

	public static void main(String[] args) {
		
		//No DUPLICATE! TreeSet is ORDERED, HashSet in not
		Set<Integer> s = new HashSet<Integer>();
		s.add(55);
		s.add(10);
		s.add(15);
		s.add(25);
		s.add(25);
		for (Integer i : s) {
			System.out.println(i);
		}
		
	}

}
