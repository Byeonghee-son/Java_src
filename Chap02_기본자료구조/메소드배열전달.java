package Chap02_기본자료구조;

import java.util.Random;

public class 메소드배열전달 {
	static void getData(int[] item) {
		Random rand = new Random(99);
		for (int i = 0; i < item.length; i++) {
			// 난수 생성하여 배열에 입력
			item[i] = rand.nextInt(10);
		}

	}

	static void showData(int[] item) {
		for (int i = 0; i < item.length; i++) {
			// 난수 생성하여 배열에 출력
			System.out.print(item[i] + " ");

		}

	}

	static int findMax(int[] data) {
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
		}
		return max;
	}

	static void sortData(int[] data) {
		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					swap(data, i, j);
				}
			}

	}

	static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;

	}

	public static void main(String[] args) {
		int[] data = new int[10];
		getData(data);
		showData(data);
		int mvalue = findMax(data);
		System.out.println();
		System.out.println("\nmax = " + mvalue);
		sortData(data);
		System.out.println("정렬 후 결과");
		showData(data);
	}
}
