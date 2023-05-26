package Chap06_정렬;

import java.util.Random;

public class BubbleSort {
	static void swap(int[] a, int i, int j) {
		int k = a[i];
		a[i] = a[j];
		a[j] = k;
	}

	static void bubbleSort(int[] a, int n) {
		int count = 0;
		int k = 0;
		while (k < n - 1) {
			int last = n-1;
			for (int j = n-1; j > k; j--) {
				count++;
				if (a[j - 1] > a[j]) {
					swap(a, j-1, j);
					last = j;
				}
			}
			k = last;
		}
		System.out.println("비교횟수 = "+ count);}
	

	




	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수: ");
		int nx = 100;
		int [] x = new int[nx];
		for(int i = 0; i < nx; i++)
			x[i] = rand.nextInt(100);
		bubbleSort(x,nx);
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++)
			System.out.print(" "+ x[i]);
	}

}
