package Chap05_재귀알고리즘;

import java.awt.Point;

class IntStackA{
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
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		IntStackA st = new IntStackA(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1; 
		count++;
		st.push(p);
		while (count < d.length) {
			ix++;		
			int cy = 0;
			while (ix < d.length) {
				cy = NextMove(d, ix, cy);
				while (cy < d[0].length) {
					Point px = new Point(ix,cy);
					st.push(px); 
					count++;
					st.dump(); //덤프를 가지고 디버깅 해보기
					break;
				}
				if (cy != d[0].length) {
					break;
				} else {
				 p = st.pop();
				 count--;
				}
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
			for (int i = 0; i <d.length; i++) {
				if(d[i][ccol] == 1)
					return false;
			}
			return true;
		}

		public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
			// 배열 d에서 d[cx][cy]의 SW대각선에 배치할수있느냐? while문으로 있다면 true 없다면 false
			int cx = x;
			int cy = y;
			while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
				cx++;
				cy--;
				if (d[cx][cy] == 1)
					return false;
			}
			cx = x;
			cy = y; // 위에서 값이 변경되었기 때문에 값을 초기화시켜줌
			while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
				cx--;
				cy++;
				if (d[cx][cy] == 1)
					return false;
			}

			return true;
		}

	public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
			// 위의 SW랑 마찬가지로 코딩하면된다
		int cx = x;
		int cy = y;
		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			cx++;
			cy++;
			if (d[cx][cy] == 1)
				return false;
		}
		cx = x;
		cy = y; // 위에서 값이 변경되었기 때문에 값을 초기화시켜줌
		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			cx--;
			cy--;
			if (d[cx][cy] == 1)
				return false;
		}
		return true;
	}

	public static boolean CheckMove(int[][]d, int x, int y) {//(x,y)로 이동 가능한지를 check
    	if(x >= 0 && x <d.length && y >= 0 && y < d[0].length && checkRow(d,x) && checkCol(d,y) && checkDiagSW(d,x,y) && checkDiagSE(d,x,y)) 
    	return true;
    	else return false;
    }

	public static int NextMove(int[][]d, int row, int newCol) {//다음 row에 대하여 이동할 col을 조사
    	int col = newCol + 1;
		while(col <= d[0].length) {
			if(CheckMove(d,row,col)) {
				return col;
			}
			col++;
		}
    	return -1;
	}
		public static void main(String[] args) {
			int row = 8, col = 8;
			int[][] data = new int[row][col];
			for (int i = 0; i < data.length; i++)
				for (int j = 0; j < data[0].length; j++)
					data[i][j] = 0;

			SolveQueen(data);

			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(" " + data[i][j]);
				}
				System.out.println();
			}
		}
}

