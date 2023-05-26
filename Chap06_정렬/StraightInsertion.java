package Chap06_정렬;

import java.util.Random;
public class StraightInsertion {
	static void swap(int[] a, int i, int j) {
			int k = a[i];
			a[i] = a[j];
			a[j] = k;
		}
		
	static void insertionSort(int[]a, int n) {
		int count = 0;
		for(int i = 1; i< n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
				count++;
			}
				a[j] = tmp;
		}
		System.out.println("반복횟수: " + count);
	}
	public static void main(String[] args) {
			Random rand = new Random();
			System.out.println("버블 정렬(버전 1)");				System.out.print("요솟수: ");
			int nx = 100;
			int [] x = new int[nx];
			for(int i = 0; i < nx; i++)
				x[i] = rand.nextInt(100);
				insertionSort(x,nx);
				System.out.println("오름차순으로 정렬했습니다.");
				for(int i = 0; i < nx; i++)
					System.out.print(" "+ x[i]);
			}
		}

