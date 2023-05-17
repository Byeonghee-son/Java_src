package Chap05_재귀알고리즘;

import java.util.Scanner;

import Chap05_재귀알고리즘.IntStack.OverflowIntStackException;

class IntStack{
	private int[] stk;
	private int capacity;
	private int ptr;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	public int push(int x) throws OverflowIntStackException{
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int indexOf(int x) {
		for(int i = ptr -1; i>= 0; i--)
			if (stk[i] ==x)
				return i;
		return -1;
	}
	public boolean isEmpty() {
		return ptr <= 0;
	}
	public void dump() {
		if(isEmpty())
		if(ptr <= 0)
			System.out.println("stack이 비었다");
	else {
		for (int i =0; i < ptr; i++)
			System.out.println(stk[i] + " ");
		System.out.println();
	}
}
}
public class Recur {
	static void recur(int n) {
		IntStack s = new IntStack(n);
		while(true) {
			if(n>0) {
				System.out.println("recur("+n+"-1);");
				try {
				s.push(n);
			}catch(OverflowIntStackException e) {
				System.out.println("스택이 가득 찼습니다");
			}
				n= n - 1;
				continue;
			}
			if(s.isEmpty() != true){
				n = s.pop();
				System.out.println(n);
				n = n-2;
			}
			break;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 :");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
