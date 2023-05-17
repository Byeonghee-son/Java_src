package baekjoon;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		int min = 100000000;
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(A[i]<min) {
				min = A[i];
			}
		}
		for(int i = 0; i < N; i++) {
			if(A[i]>max) {
				max = A[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
	
}
