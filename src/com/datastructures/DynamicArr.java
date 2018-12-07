package com.datastructures;

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
		checkSize(numOfElements);
	}
	
	public void checkSize(int numOfElements) {
		int capacity = getSize();
		if(numOfElements>capacity) {
			
		}
	}

}
