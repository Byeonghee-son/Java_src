package edu;

import java.util.Random;

public class Array {

	private static int[][] intMatrix = new int[2][3];
	private static double[][] doubleMatrix = new double[2][3];
	private static long[][] longMatrix = new long[2][3];


	public static <T> void showMatrix(T[][] Matrix) {
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
				intMatrix[i][j] = rand.nextInt(100);
			}
		}
		showMatrix(intMatrix);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				doubleMatrix[i][j] = rand.nextDouble();
			}
		}
		showMatrix(doubleMatrix);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				longMatrix[i][j] = rand.nextLong();
			}
		}
		showMatrix(longMatrix);
		
		Array.<Integer>showMatrix(intMatrix);
		Array.<Double>showMatrix(doubleMatrix);
		Array.<Long>showMatrix(longMatrix);
	}
}
