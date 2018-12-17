package com.collections;
import java.util.*;

public class MyPriorityQueue {

	public static void main(String[] args) {
		//Implement the Comparable to Person
		PriorityQueue<Person> q = new PriorityQueue<Person>();
		q.add(new Person("Ali",55));
		q.add(new Person("Veli",20));
		q.add(new Person("Cenk",30));
		System.out.println(q.poll().name);
	}

}
