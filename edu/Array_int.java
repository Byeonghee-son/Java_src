package edu;

import java.util.Random;

public class Array_int {
	static int[][] Matrix = new int[2][3];

	public static void showMatrix() {
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[0].length; j++) {
				System.out.print(Matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				Matrix[i][j] = rand.nextInt(100);
			}
		}
		showMatrix();
	}
}
