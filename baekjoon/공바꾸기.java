package baekjoon;

import java.util.Scanner;

public class 공바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("바구니의 갯수와 공 바꿀 횟수를 정한다 ( , )");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int []arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		for(int a = 0; a < M; a++) {
			System.out.println("몇번째 바구니와 몇번째 바구니를 바꿀지 정한다");
			int i = sc.nextInt();
			int j = sc.nextInt();
			int temp = 0;
			temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;			
		}
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();
	}
}
