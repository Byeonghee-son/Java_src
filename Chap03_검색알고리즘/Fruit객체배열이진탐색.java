package Chap03_검색알고리즘;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

class Fruit {
	String name;
	int price;
	String expire;

	protected Fruit(String name, int price, String expire) {
		this.name = name;
		this.price = price;
		this.expire = expire;
	}

	protected int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", expire=" + expire + "]";
	}

	public static final Comparator<Fruit> PRICE_ORDER = new PriceOrderComparator();

	private static class PriceOrderComparator implements Comparator<Fruit> {
		public int compare(Fruit f1, Fruit f2) {
			return Integer.compare(f1.price, f2.price);
		}
	}

	public class Fruit객체배열이진탐색 {

		public static void main(String[] args) {
			Fruit[] arr = { new Fruit("사과", 200, "2023-5-8"), new Fruit("키위", 500, "2023-6-8"),
					new Fruit("오렌지", 200, "2023-7-8"), new Fruit("바나나", 50, "2023-5-18"),
					new Fruit("수박", 880, "2023-5-28"), new Fruit("체리", 10, "2023-9-8") };
			System.out.println("정렬전 객체 배열: ");
			showData(arr);
			// Arrays.sort(arr, null);
			Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice()); // Fruit에 compareTo()가 있어도 람다식 우선 적용
			System.out.println("람다식 정렬(가격)후 객체 배열: ");
			showData(arr);

			Arrays.sort(arr, new Comparator<Fruit>() {
				@Override
				public int compare(Fruit a1, Fruit a2) {
					return a1.getName().compareTo(a2.getName());
				}
			});
			System.out.println("comparator 정렬(이름)후 객체 배열: ");
			showData(arr);

			Comparator<Fruit> cc_name = new Comparator<Fruit>() {

				@Override
				public int compare(Fruit o1, Fruit o2) {
					// TODO Auto-generated method stub
					return o1.name.compareTo(o2.name);
				}// 익명클래스 사용

			};
			Comparator<Fruit> cc_expire = new Comparator<Fruit>() {

				 @Override
				    public int compare(Fruit o1, Fruit o2) {
				        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				        try {
				            Date date1 = format.parse(o1.expire);
				            Date date2 = format.parse(o2.expire);
				            return date1.compareTo(date2);
				        } catch (ParseException e) {
				            e.printStackTrace();
				        }
					return 0;
				}// 익명클래스 사용

			};
			

			Fruit newFruit = new Fruit("체리", 500, "2023-5-18");
			int result3 = Arrays.binarySearch(arr, newFruit, cc_name);
			System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
			System.out.println("+++++++");
			Arrays.sort(arr, cc_expire);
			result3 = binarySearch(arr, newFruit, cc_expire);
			System.out.println("\nbinarySearch() 조회결과::" + result3);

			sortData(arr, cc_expire);
			System.out.println("comparator 정렬(유통기간)후 객체 배열: ");
			showData(arr);
			result3 = Arrays.binarySearch(arr, newFruit, cc_expire);
			System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
			result3 = binarySearch(arr, newFruit, cc_name);
			System.out.println("\nbinarySearch() 조회결과::" + result3);
		}

		private static void showData(Fruit[] arr) {

			for (Fruit data : arr) {
				System.out.print(data + " ");
			}
			System.out.println();
			System.out.println();
		}

		private static void sortData(Fruit[] arr, Comparator<? super Fruit> cc) {
			//
			int n = arr.length;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i].compareTo(arr[j]) < 0) {
						swap(arr, i, j);
					}
				}
			}
		}

		private static void swap(Fruit[] arr, int i, int j) {
			// TODO Auto-generated method stub
			Fruit temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
	}

	private static int binarySearch(Fruit[] arr, Fruit newFruit, Comparator<? super Fruit> cc) {
//
		int pl = 0;
		int pr = arr.length - 1;

		do {
			int pc = (pl + pr) / 2;
			if (cc.compare(newFruit, arr[pc]) == 0)
				return pc;
			else if (cc.compare(newFruit, arr[pc]) < 0)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}

	public int compareTo(Fruit fruit) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
