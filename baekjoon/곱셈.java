package baekjoon;

import java.util.Scanner;

public class 곱셈 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("A를 입력하세요 : ");
	int a = sc.nextInt();
	System.out.println("B를 입력하세요 : ");
	int b = sc.nextInt();
	int c = b % 10; // b의 일의자리수
	int d = (b / 10) % 10; // b의 십의자리수
	int e = (b / 100) % 10; // b의 백의자리수
	int mul1 = a * c ;
	int mul2 = a * d ;
	int mul3 = a * e ;
	System.out.println(mul1);
	System.out.println(mul2);
	System.out.println(mul3);
	System.out.println(mul1+(mul2*10)+(mul3*100));
}
}
