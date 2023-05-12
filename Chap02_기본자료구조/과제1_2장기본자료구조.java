package Chap02_기본자료구조;

class PhyscData implements Comparable<PhyscData> {
	Object o;
	String name;
	int height;
	double vision;

	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public int compareTo(PhyscData o) {

		if (this.name.equals(o.name)) { // 이름이 같으면
			if (this.height == o.height) { // 키가 같으면
				return Double.compare(this.vision, o.vision); // 시력 순으로 정렬
			} else {
				return Integer.compare(this.height, o.height); // 키 순으로 정렬
			}
		} else {
			return this.name.compareTo(o.name); // 이름 순으로 정렬
		}
	}

	@Override
	public String toString() {
		return name + " (" + height + "cm, 시력:" + vision + ")";
	}

}

public class 과제1_2장기본자료구조 {

	public static void main(String[] args) {
		PhyscData[] data = { 
				new PhyscData("홍길동", 162, 0.3), 
				new PhyscData("홍길", 164, 1.3),
				new PhyscData("홍동", 152, 0.7), 
				new PhyscData("김홍길동", 172, 0.3), 
				new PhyscData("이길동", 182, 0.6),
				new PhyscData("박길동", 167, 0.2), 
				new PhyscData("최길동", 169, 0.5)
				};

		showData(data);

		sortData(data);

		System.out.println("정렬 후 결과");
		showData(data);
	}

	private static void sortData(PhyscData[] data) {

		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);
				}
			}
	}

	private static void showData(PhyscData[] data) {

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i] + " ");

		}
	}

	static void swap(PhyscData[] data, int i, int j) {
		PhyscData temp = data[i];
		data[i] = data[j];
		data[j] = temp;

	}

}
