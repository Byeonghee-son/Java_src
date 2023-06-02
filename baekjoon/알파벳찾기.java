package baekjoon;

import java.util.Scanner;

public class 알파벳찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int [] alphabet = new int [26];
		for(int i = 0; i< 26; i++) {
			alphabet[i] = -1;
		}
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if(alphabet[ch - 'a'] == -1) {
				alphabet[ch-'a'] = i;
			}
		}
		for(int i = 0; i < 26; i++) {
		System.out.print(alphabet[i]+" ");
		}
	}
}
