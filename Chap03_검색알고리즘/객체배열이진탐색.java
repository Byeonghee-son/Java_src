package Chap03_검색알고리즘;

import java.util.Arrays;

class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public int compareTo(PhyscData pd) {
		// TODO Auto-generated method stub
		int result = this.name.compareTo(pd.name);
		if (result == 0) {
			int hresult = this.height - pd.height;
			if (hresult == 0) {
				return Double.compare(this.vision, pd.vision);
			} else
				return hresult;
		} else
			return result;
	}

	@Override
	public String toString() {
		return name + " (" + height + "cm, 시력:" + vision + ")";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof PhyscData) {
            PhyscData pd = (PhyscData) obj;
            return this.name.equals(pd.name) && this.height == pd.height && this.vision == pd.vision;
        }
        return false;
    }
}

public class 객체배열이진탐색 {

	public static void main(String[] args) {
		PhyscData[] data = { new PhyscData("홍길동", 162, 0.3), new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7), new PhyscData("김홍길동", 172, 0.3), new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2), new PhyscData("길동", 167, 0.5), };
		
		showData(data);
		Arrays.sort(data);
		showData(data);
		
		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		
		key = new PhyscData("길동", 167, 0.5);
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}

	private static int binarySearch(PhyscData[] data, PhyscData key) {
		// TODO Auto-generated method stub
		int pl = 0;
		int pr = data.length - 1;

		do {
			int pc = (pl + pr) / 2;
			int result = data[pc].compareTo(key);
			if (result == 0)
				return pc;
			else if (result < 0)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}

	private static int linearSearch(PhyscData[] data, PhyscData key) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < data.length) {
			if (data[i].equals(key))
				return i;
			i++;
		}
		return -1;
	}

	static void showData(PhyscData[] arr) {
		System.out.println();
		for (PhyscData data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	static void sortData(PhyscData[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(arr, i, j);
			}
		}
	}

	static void swap(PhyscData[] arr, int i, int j) {
		PhyscData temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}