package baekjoon;

import java.util.Scanner;

public class 개수세기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(a[i] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}
