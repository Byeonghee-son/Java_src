package baekjoon;

import java.util.Scanner;

public class 첫글자마지막글자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int a = 0; a < i; a++) {
			String s = sc.nextLine();
			char first = s.charAt(0);
			char last = s.charAt(s.length()-1);
			System.out.println(first + last);
		}
	}
}
