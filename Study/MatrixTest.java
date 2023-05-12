package Study;

public class MatrixTest {
	public static void main(String[] args) {

		Matrix A = new Matrix(2, 3);
		Matrix A1 = new Matrix(2, 3);
		Matrix B = new Matrix(3, 4);
		
		A.setData();
		A1.setData();
		B.setData();
		
		A.showData("A");
		A1.showData("A1");
		B.showData("B");
		
		
		// 클래스.함수로 만들때 클래스에서 static으로 만들어야한다.
		Matrix A2 = Matrix.addMatrix(A, A1);
		A2.showData("A2");
		
		//System.out.println(A2.rowCount);
		int row = A2.getRowCount();
		System.out.println(row);
		
		A2.setRowCount(A2.getRowCount());
		System.out.println(A2.getRowCount());
		
		Matrix D = A.Transpose();
		D.showData("D");
		
		Matrix C = Matrix.multiplyMatrix(A,B);
	}
}
