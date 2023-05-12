package baekjoon;

import java.util.Scanner;

public class 사분면 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x좌표를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.println("y좌표를 입력하세요 : ");
		int y = sc.nextInt();
		if(x > 0 && y > 0) {
			System.out.println("("+x+","+ y +")는 제 1사분면 입니다" );
		}else if(x < 0 && y > 0) {
			System.out.println("("+x+","+ y +")는 제 2사분면 입니다" );
		}else if(x < 0 && y < 0) {
			System.out.println("("+x+","+ y +")는 제 3사분면 입니다" );
		}else if(x < 0 && y < 0) {
			System.out.println("("+x+","+ y +")는 제 4사분면 입니다" );
		}else {
			System.out.println("사분면에 속해있지 않고 축에 있습니다");
		}
			
}
}
