package baekjoon;

import java.util.Scanner;

public class 영수증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 금액을 입력하세요 :  ");
		int X = sc.nextInt();
		System.out.println("물건 종류의 수를 입력하세요 :  ");
		int N = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			System.out.println("각 물건의 가격을 입력하세요");
			int a = sc.nextInt();
			System.out.println("각 물건의 갯수를 입력하세요");
			int b = sc.nextInt();
			sum += a * b;
		}
		if(X == sum) {
			System.out.println("Yes");
		}else System.out.println("NO");
	}
}
