package baekjoon;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];
		for(int i = 0 ; i < 9; i++) {
			A[i] = sc.nextInt();
		}
		int max = 0;
		int c = 0;
		for(int i = 0; i < 9; i++) {
			if(max<A[i]) {
				max = A[i];
				c = i+1;
			}
		}
		System.out.println("최댓값은 : " + max +"이며 이 값은 " + c + "번째 수이다.");
	}
}
