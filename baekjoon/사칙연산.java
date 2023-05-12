package baekjoon;

import java.util.Scanner;

public class 사칙연산 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 수를 입력하세요 : ");
	int a = sc.nextInt();
	System.out.println("두번째 수를 입력하세요 : ");
	int b = sc.nextInt();
	int sum = a + b;
	int minus = a - b;
	int multiply = a * b;
	int divide = a / b;
	int rest = a % b ;
	System.out.println("두 수의 합 : " + sum);
	System.out.println("두 수의 차 : " + minus);
	System.out.println("두 수의 곱 : " + multiply);
	System.out.println("두 수의 제 : " + divide);
	System.out.println("두 수를 나눈 후 나머지 : " + rest);
	
}
}
