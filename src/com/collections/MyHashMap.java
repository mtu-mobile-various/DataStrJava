package com.collections;
import java.util.*;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ali");
		map.put(5, "Veli");
		map.put(10, "Kadir");
		
		System.out.println(map.get(5));
		
		for (Map.Entry m: map.entrySet()) {
			System.out.println("key:"+m.getKey() + ",value:"+m.getValue());
		}

	}

}
