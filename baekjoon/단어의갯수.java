package baekjoon;

import java.util.Scanner;

public class 단어의갯수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String [] words = S.split(" ");
		System.out.println(words.length);
	}
}
