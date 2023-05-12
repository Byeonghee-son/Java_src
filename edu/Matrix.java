package edu;

import java.util.ArrayList;
import java.util.Random;

public class Matrix <T>{
	
	private int rows;
	private int cols;
	
	//private  T[][] data;
	
	//private ArrayList<T> data = new ArrayList<T>();
	
	public <T>Matrix(int row, int col) {
		this.rows = row;
		this.cols = col;
		
		ArrayList<T> data = new ArrayList<T>();
		//this.data = new T[row][col];
		setData();
		
	}
	
	protected void setData() {
		Random rand = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < this.rows * this.cols; i++) {
			if(this.type == Integer.class) {
				data.add((T)rand.nextInt(100));
			}
		}
	}
	
	protected void showData() {
		
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.cols; j++) {
				System.out.print(this.data[i][j] +"\t");
			}
			System.out.println();
		}
	}
	
	
	
}
