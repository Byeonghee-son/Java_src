package baekjoon;

import java.util.Scanner;

public class 시험성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		int a = sc.nextInt();
		char grade = 'A';
		
		if( a >= 90) {
			grade = 'A';
			System.out.println(grade);
		} else if( 80 <= a & a <90) {
			grade = 'B';
			System.out.println(grade);
		}else if( 70 <= a & a <80) {
		grade = 'C';
		System.out.println(grade);
		}else if( 60 <= a & a <70) {
			grade = 'D';
			System.out.println(grade);
		}else{
			grade = 'F';
			System.out.println(grade);		
		}
		}
}
}