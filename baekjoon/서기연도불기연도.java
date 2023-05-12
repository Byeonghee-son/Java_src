package baekjoon;

import java.util.Scanner;

public class 서기연도불기연도 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("불기연도를 입력하세요 : ");
		int y = sc.nextInt();
		int z = y - 543 ;
		System.out.println("서기연도는 " + z +" 입니다." );
		}
	}
}
