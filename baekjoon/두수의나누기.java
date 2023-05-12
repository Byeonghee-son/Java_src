package baekjoon;

import java.util.Scanner; //유틸에서 import해서 scanner를 가져와야한다

public class 두수의나누기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner을 쓸때는 system.in 이 들어간다(주로 입력하는것들에는 전부다 들어간다)
		System.out.println("A를 입력하세요 : ");
		int A = sc.nextInt();
		System.out.println("B를 입력하세요 : ");
		int B = sc.nextInt();
		double divide = A / (double)B;
		System.out.printf("두 수의 나누기 : %.2f", divide); //소숫점을 제한하고 싶을때 printf를 쓰고 %.nf를 쓰면 n번째까지 소숫점이 출력된다
	}
}

