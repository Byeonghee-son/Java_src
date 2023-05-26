package Chap05_재귀알고리즘;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
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

class IntStackA {
	private Point[] stk; // 스택용 배열
	private int capacity; // 스택용 크기
	private int ptr; // 스택 포인터

	public static class EmptyObjectStackException extends RuntimeException {
		public EmptyObjectStackException() {
		} // 생성자
	}

	public static class OverflowObjectStackException extends RuntimeException {
		public OverflowObjectStackException() {
		}
	}

	public IntStackA(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new Point[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public void push(Point x) throws OverflowObjectStackException {
		if (ptr >= capacity)
			throw new OverflowObjectStackException();
		stk[ptr++] = x;
	}

	public Point pop() throws EmptyObjectStackException {
		if (ptr <= 0)
			throw new EmptyObjectStackException();
		return stk[--ptr];
	}

	public Object peek() throws EmptyObjectStackException {
		if (ptr <= 0)
			throw new EmptyObjectStackException();
		return stk[ptr - 1];
	}

	public void clear() {
		ptr = 0;
	}

	public int indexOf(Object x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i].equals(x))
				return i;
		}
		return -1;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public void dump() {
		if (isEmpty())
			System.out.println("stack이 비었습니다.");
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.println(stk[i] + " ");
			}
			System.out.println();
		}
	}

	public int size() {
		return ptr;
	}

	public int getCapacity() {
		return capacity;
	}
}

public class EightQueen {
	public static void SolveQueen(int[][] d) {
		IntStackA st = new IntStackA(10);
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		st.push(p);
		int cy = 0;
		System.out.println("push(" + p + ")");
		count++;
		while (count < d.length) {
			if (mode == 0) {
				ix++;
				cy = 0;
			}
			System.out.println("ix = " + ix + " cy = " + cy);
			cy = NextMove(d, ix, cy);
			if (cy != -1) {
				Point px = new Point(ix, cy);
				System.out.println("push(" + px + ")");
				st.push(px);
				d[ix][cy] = 1;
				count++;
				st.dump(); // 덤프를 가지고 디버깅 해보기
				mode = 0;
			} else {
				p = st.pop();
				System.out.println("pop(" + p + ")");
				ix = p.getX();
				cy = p.getY();
				count--;
				d[ix][cy] = 0;
				cy++;
				mode = 1;
			}
		}

	}

	public static boolean checkRow(int[][] d, int crow) {
		// 배열 d에서 crow에 Queen을 놓을 수 있느냐?
		for (int j = 0; j < d.length; j++) {
			if (d[crow][j] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		// 배열 d에서 ccol 열에 배치할수 있는냐? 있으면 true로 리턴 없다면 false로 리턴
		for (int i = 0; i < d[0].length; i++) {
			if (d[i][ccol] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		// 배열 d에서 d[cx][cy]의 SW대각선에 배치할수있느냐? while문으로 있다면 true 없다면 false
		int cx = x;
		int cy = y;
		while ((cy >= 0 && cy < d[0].length) && (0 <= cx && cx < d[0].length)) {
			if (d[cx][cy] == 1)
				return false;
			cx--;
			cy++;

		}

		cx = x;
		cy = y;
		while ((0 <= cy && cy < d[0].length) && (cx >= 0 && cx < d.length)) {
			if (d[cx][cy] == 1)
				return false;
			cx++;
			cy--;

		}

		return true;
	}

	public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
		// 위의 SW랑 마찬가지로 코딩하면된다
		int cx = x;
		int cy = y;
		while (cx >= 0 && cy >= 0) {
			if (d[cx][cy] == 1)
				return false;
			cx--;
			cy--;

		}

		cx = x;
		cy = y;
		while (cx < d.length && cy < d.length) {
			if (d[cx][cy] == 1)
				return false;

			cx++;
			cy++;

		}
		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if ((d[x][y] == 0) && checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y))
			return true;
		else
			return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
		for (int nextCol = col; nextCol < d.length; nextCol++) {
			if (CheckMove(d, row, nextCol) == true) {
				return nextCol;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		final int N = 8;
		int row = N, col = N;
		int[][] data = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
