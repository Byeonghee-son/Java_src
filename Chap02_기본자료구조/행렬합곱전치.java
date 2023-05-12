package Chap02_기본자료구조;

import java.util.Random;

public class 행렬합곱전치 {
	static void getData(int[][] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}
	}

	static void showData(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	static int[][] addMatrix(int[][] arr1, int[][] arr2) {
		int[][] result = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return result;
	}

	static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
		int[][] result = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int k = 0; k < arr2[0].length; k++) {
				int sum = 0;

				for (int j = 0; j < arr2.length; j++) {

					sum += arr1[i][j] * arr2[j][k];
				}
				result[i][k] = sum;
			}
		}
		return result;
	}

	static int[][] Transpose(int[][] arr1) {
		int[][] result = new int[arr1[0].length][arr1.length];
		for (int r = 0; r < arr1.length; r++) {
			for (int c = 0; c < arr1[0].length; c++) {
				result[c][r] = arr1[r][c];

			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[][] A = new int[2][3];
		int[][] A1 = new int[2][3];
		int[][] B = new int[3][4];

		getData(A);
		getData(A1);
		System.out.println("행렬 A:");
		showData(A);

		getData(B);
		System.out.println("행렬 B:");
		showData(B);

		System.out.println("행렬 A1:");
		showData(A1);

		int[][] A2 = addMatrix(A, A1);

		System.out.println("행렬 A2:");
		showData(A2);

		int[][] C = multiplyMatrix(A, B);
		System.out.println("행렬 C:");
		showData(C);

		int[][] D = Transpose(A);
		System.out.println("행렬 D:");
		showData(D);
	}

}
