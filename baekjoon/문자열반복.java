package baekjoon;

import java.util.Scanner;

public class 문자열반복 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String S = sc.next();
		String P = "";
		for(int i = 0; i<S.length(); i++) {
			char ch = S.charAt(i);
			for(int a = 0; a < T; a++) {
			P += ch;
			}
		}
		System.out.println(P);
	}
}
