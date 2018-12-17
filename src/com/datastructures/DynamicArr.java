package com.datastructures;

import java.util.Arrays;

public class DynamicArr<T> {

	Object[] objs;
	int numOfElements;
	
	DynamicArr(){
		numOfElements = 0;
		objs = new Object[1];
	}
	
	public int getSize() {
		return objs.length;
	}
	
	public T getObj(int index) {
		return (T) objs[index];
	}
	
	public void put(Object obj) {
		checkSize(numOfElements+1);
		objs[numOfElements]=obj;
		numOfElements++;
	}
	
	public void checkSize(int numOfElements) {
		int capacity = getSize();
		if(numOfElements==capacity) {
			int newCap = capacity * 2;
			objs = Arrays.copyOf(objs, newCap);
		}
	}

}
