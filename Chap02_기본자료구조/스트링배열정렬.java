package Chap02_기본자료구조;


public class 스트링배열정렬 {

	static void showData(String[] item) {
		for (int i = 0; i < item.length; i++) {
			System.out.print(item[i] + " ");

		}

	}

	static void sortData(String[] data) {
		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo("data[j]") > 0) {
					swap(data, i, j);
				}
			}

	}

	static void swap(String[] data, int i, int j) {
		String temp = data[i];
		data[i] = data[j];
		data[j] = temp;

	}

	public static void main(String[] args) {
		String[] data = { "apple", "grape", "melon" };
		showData(data);
		sortData(data);
		System.out.println("정렬 후 결과");
		showData(data);
	}
}
