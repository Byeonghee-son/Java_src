package Chap03_검색알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class 정수배열이진탐색 {
	public static void main(String[] args) {
		int[]data = new int[10];
		inputData(data);
		showData(data);
		sortData(data);
		System.out.println();
		for(int num: data) {
			System.out.print(num+" ");
		}
		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		
		key = 39;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}

	private static int binarySearch(int[] data, int key) {
		// TODO Auto-generated method stub
		int pl = 0;
		int pr = data.length - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if(data[pc] == key)
				return pc;
			else if(data[pc] < key)
				pl = pc + 1;
			else pr = pc - 1;
		} while (pl <= pr);
			return -1;
		}
	

	private static int linearSearch(int[] data, int key) {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			if(i == 10)
				return -1;
			if(data[i] == key)
				return data[i];
			i++;
		}
	}

	private static void inputData(int[] data) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i=0; i < data.length; i++) {
			data[i]= rand.nextInt(50);
		}
	}

	private static void showData(int[] data) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
	}

	private static void sortData(int[] data) {
		int n = data.length;
		for(int i = 0; i < n; i++) {
			for(int j = i +1; j< n; j++) {
				if(data[i] > data[j]) {
					swap(data,i,j);
				}
			}
		}
		
	}

	private static void swap(int[] data, int i, int j) {
		// TODO Auto-generated method stub
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		
	}
}
