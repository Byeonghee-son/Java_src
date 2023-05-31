package baekjoon;

import java.util.Scanner;

public class 바구니바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		int [] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		for(int a = 0; a < M ; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			while(i < j) {
				int tmp = arr[i-1];
				arr[i-1] = arr[j-1];
				arr[j-1] = tmp;
				i++;
				j--;
			}
		}
		for(int b = 0; b < N; b++) {
			System.out.print(arr[b] + "\t");
		}
	}
}
