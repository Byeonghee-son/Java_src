package baekjoon;

import java.util.Scanner;

public class 바구니공넣기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("바구니의 갯수와 공을 넣을 횟수를 정하라( , )");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int [N];
		System.out.println("공을 몇번 바구니 부터 몇번 바구니까지 몇번의 공을 넣을지 정하라 ( , , )");
		for(int a = 0; a < M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(int b = i-1; b < j; b++) {
				arr[b] = k;
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
