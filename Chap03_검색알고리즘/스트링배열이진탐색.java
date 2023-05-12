package Chap03_검색알고리즘;

import java.util.Arrays;

public class 스트링배열이진탐색 {
	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "감", "배", "사과", "포도", "pear", "blueberry", "strawberry",
				"melon", "oriental melon" };

		showData(data);
		sortData(data);
		System.out.println();
		showData(data);

		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

	private static int binarySearch(String[] data, String key) {
		// TODO Auto-generated method stub
		int pl = 0;
		int pr = data.length - 1;
		do {
			int pc = (pl + pr) / 2;
			if (data[pc].equals(key))
				return pc;
			else if (data[pc].compareTo(key) < 0)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
			return -1;
		}

	

	private static int linearSearch(String[] data, String key) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < data.length) {
			if (data[i].equals(key))
				return i;
			i++;
		}
		return -1;
	}

	private static void sortData(String[] data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);
				}
			}
		}
	}

	private static void swap(String[] data, int i, int j) {
		String temp = data[i];
		data[i] = data[j];
		data[j] = temp;

	}

	private static void showData(String[] data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
	}
}
