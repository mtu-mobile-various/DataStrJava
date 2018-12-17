package com.recursion;

public class Square {
	
	static int sqr(int n, int k) {
		if(k==0)
			return 1;
		else
			return (n * sqr(n,k-1));
	}
	
	//More efficient algorithm
	//O(log n)
	static int square(int n, int k) {
		if(k==0)
			return 1;
		else if (k%2==0)
			return (int) Math.pow(square(n, k/2),2);
		else
			return n * (int) Math.pow(square(n, (k-1)/2),2);
	}

	public static void main(String[] args) {
		System.out.println(sqr(2,6));
		System.out.println(square(2,6));

	}

}
