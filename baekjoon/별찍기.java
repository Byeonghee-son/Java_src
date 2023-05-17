package baekjoon;

import java.util.Scanner;

public class 별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수를 입력하세요: ");
		int C = sc.nextInt();
		for(int i = 1; i <= C; i++) {
			for(int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
}
}