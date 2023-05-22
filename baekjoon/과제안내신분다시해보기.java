package baekjoon;

import java.util.Scanner;
//다시해보기

public class 과제안내신분다시해보기{
	public static void main(String[] args) {
		boolean []brr = new boolean[31];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< 28; i++) {
			int a = sc.nextInt();
			brr[a]= true;
		}
		int first = 0;
		for(int i = 1; i<=30; i++) {
			if(!brr[i]) {
				first = i;
				break;
			}
		}
		int second = 0;
		for(int i = first + 1; i <=30; i++) {
			if(!brr[i]) {
				second = i;
				break;
			}
		}
		System.out.println(first);
		System.out.println(second);
	}
}
