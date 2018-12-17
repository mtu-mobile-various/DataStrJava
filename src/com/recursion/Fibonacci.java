package com.recursion;

public class Fibonacci {

	//Binary recursion gives the element at a given index
	static int fib(int n) {
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	
	//Linear recursion returning PAIR of numbers
	//makes n-1 recursive calls
	static int[] getFib(int n) {
		int[] arr = new int[2];
		if (n<=1) {
			arr[0] = 0;
			arr[1] = 1;
			return arr;
		}else {
			arr = getFib(n-1);
			arr[0] = getFib(n-1)[0]+getFib(n-1)[1];
			arr[1] = getFib(n-1)[0];
			return arr;
		}
		   
	}
	
	public static void main(String[] args) {
		System.out.println(fib(7));
		System.out.println(getFib(7)[0]+", "+getFib(7)[1]);
	}

}
