package Chap06_정렬;
//배열을 나눔

import java.util.Random;

public class QuickSort {
	static int count = 0;

 //--- 배열 요소 a[idx1]과 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
     int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
 }

 //--- 배열을 나눔 ---//
	static void qs(int[] a, int left, int right) {
     int pl = left;        // 왼쪽 커서
     int pr = right;    // 오른쪽 커서
     int x = a[(pl+pr)/2];  // 피벗(가운데 요소)
     do {
         while (a[pl] < x) 
        	 pl++; count++;
         while (a[pr] > x) 
        	 pr--; count++;
         if (pl <= pr)
             swap(a, pl++, pr--);
         	count++;
     } while (pl <= pr);
     if(left <pr) qs(a, left, pr);
     if(pl < right) qs(a, pl, right);
     System.out.println("비교횟수 : " + count);
 }
     
	public static void main(String[] args) {
	     System.out.println("배열을 나눕니다.");
	     Random rand = new Random();
	     int nx = 100;
	     int[] x = new int[nx];
	     for(int i = 0; i < nx; i++) {
	    	 x[i]= rand.nextInt();
	     }
	     qs(x, 0, 9);                // 배열 x를 나눔
	     for (int i = 0; i < nx; i++) {
	         System.out.print("x[" + i + "]: ");
	     }
	 }
}
