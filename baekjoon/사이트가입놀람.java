package baekjoon;

import java.util.Scanner;

public class 사이트가입놀람 {
	public static void main(String[] args) {
		String id = "joonas";
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하세요 : ");
		String mid = sc.next();
		if(id.equals(mid)) {  //문자열이 같은지 비교할때는 equals를 쓴다
			System.out.println(mid+"??!");
		}
	}
}
