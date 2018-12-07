package com.datastructures;

public class OneDimArr {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		Person[] persons = new Person[4];
		persons[0] = new Person("Ali", 3);
		persons[1] = new Person("Veli", 13);
		persons[2] = new Person("Cenk", 23);
		persons[3] = new Person("Serdar", 33);
		
		for ( Person person : persons) {
			System.out.println("Name: " + person.name + ", age: " + person.age);
		}
	}

}
