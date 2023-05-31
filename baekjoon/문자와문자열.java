package baekjoon;

import java.util.Scanner;

public class 문자와문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int i = sc.nextInt();
		
		char result = S.charAt(i-1);
		
		System.out.println(result);
	}
}
