package baekjoon;

import java.util.Scanner;

public class 나머지2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			arr[i] = arr[i] % 42;
		}
		sc.close();
		int count = 0;
		for(int i = 0; i < 10; i++) {
			boolean rest = true;
			for(int j = i+1; j<10; j++) {
				if(arr[i] == arr[j]) {
					rest = false;
					break;
				}
			}
			if(rest) {
				count++;
			}
			
		}
		System.out.println(count);
	}
}
