package baekjoon;

import java.util.Scanner;

public class 나머지 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("A를 입력하세요 : ");
	int A = sc.nextInt();
	System.out.println("B를 입력하세요 : ");
	int B = sc.nextInt();
	System.out.println("C를 입력하세요 : ");
	int C = sc.nextInt();
	
	System.out.println("(A+B)%C = " + (A+B)%C);
	System.out.println("((A%C)+(B%C))%C = " + ((A%C)+(B%C))%C);
	System.out.println("(A*B)%C = " + (A*B)%C);
	System.out.println("((A%C)*(B%C))%C = " + ((A%C)*(B%C))%C);
	}
}
