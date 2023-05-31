package baekjoon;

import java.util.Scanner;

public class 평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] arr = new double[N];
		int M = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			if(a > M) {
				M = a;
			}
		}
		double [] newarr = new double[N];
		double sum = 0;
		for(int i = 0; i < N; i++) {
			newarr[i] = (arr[i]/M) * 100;
			sum += newarr[i];
		}
		double avg = sum / N ;
		System.out.println("새로운 평균은 : " + avg);
	}
}
