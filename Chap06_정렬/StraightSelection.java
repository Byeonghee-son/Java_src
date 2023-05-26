package Chap06_정렬;
import java.util.Random;

public class StraightSelection {

	static void swap(int[] a, int i, int j) {
			int k = a[i];
			a[i] = a[j];
			a[j] = k;
		}
	
	static void selectionSort(int[]a, int n) {
		int count = 0;
		for(int i = 0; i< n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				count++;
				if(a[j] < a[min])
					min = j;
			}
			swap(a, i, min);
		}
		System.out.println("반복횟수: " + count);
	}
		public static void main(String[] args) {
			Random rand = new Random();
			System.out.println("버블 정렬(버전 1)");
			System.out.print("요솟수: ");
			int nx = 100;
			int [] x = new int[nx];
			for(int i = 0; i < nx; i++)
				x[i] = rand.nextInt(100);
			selectionSort(x,nx);
			System.out.println("오름차순으로 정렬했습니다.");
			for(int i = 0; i < nx; i++)
				System.out.print(" "+ x[i]);
		}

	}


