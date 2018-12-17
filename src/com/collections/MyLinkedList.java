package com.collections;

import java.util.*;

public class MyLinkedList {
	
	
	public static void main(String args[]) {
	
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Hi");
		lst.add("how");
		lst.add("you");
		lst.add("doing");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
