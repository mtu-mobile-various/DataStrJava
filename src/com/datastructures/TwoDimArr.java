package com.datastructures;

public class TwoDimArr {

	public static void main(String[] args) {
		int[][] table = new int[2][2];
		table[0][0] = 1;
		table[0][1] = 2;
		table[1][0] = 3;
		table[1][1] = 4;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
