package com.datastructures;

public class LinkedListRun {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add("Ali");
		ls.add("Veli");
		ls.add("Cenk");
		ls.display();
		ls.delete();
		System.out.println("after delete:");
		ls.display();

	}

}
