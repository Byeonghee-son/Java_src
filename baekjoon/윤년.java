package baekjoon;

import java.util.Scanner;

public class 윤년 {
public static void main(String[] args) {
	int year = 0;
	for(year = 2000; year < 3000 ; year++) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println(year + "년은 윤년입니다.");
		else System.out.println(year + "년은 윤년이 아닙니다");
		}	
	}
	
}
