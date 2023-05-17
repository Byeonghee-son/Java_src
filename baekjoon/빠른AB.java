package baekjoon;

import java.util.Scanner;

public class 빠른AB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum = a + b ;
		System.out.println("Case #"+(i+1)+":"+ a + "+" + b + "=" + sum);
		}
	}
}
