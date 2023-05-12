package Chap04_스택과큐;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//int형 고정 길이 큐
class objectQueue {
	private List<Point> que;
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
	private int num; // 현재 데이터 개수

	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
		}
	}

	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
		}
	}

	public objectQueue(int maxlen) {
		front = rear = num = 0;
		capacity = maxlen;
		try {
			que = new ArrayList<Point>(capacity);
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public Point enque(Point x) throws OverflowQueueException {
		if (num >= capacity)
			throw new OverflowQueueException();
		que.add(x);
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	public Point deque() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException();
		Point x = que.remove(0);
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	public Point peek() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException();
		return que.get(0);
	}

	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que.get(i) + " ");
			System.out.println();
		}
	}

	public int size() {
		return num;
	}

	public int getCapacity() {
		return capacity;
	}

}

class Pointo {
	private int x;
	private int y;

	public Pointo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

//int형 고정 길이 큐의 사용 예
public class 큐객체 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		objectQueue s = new objectQueue(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point p = null;
		while (true) {
			System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 인큐
				System.out.print("데이터: ");
				rndx = random.nextInt() % 20;
				rndy = random.nextInt() % 20;
				p = new Point(rndx, rndy);
				try {
					s.enque(p);
				} catch (objectQueue.OverflowQueueException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = s.deque();
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (objectQueue.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = s.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (objectQueue.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
			}
		}
	}
}