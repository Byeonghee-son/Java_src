package Study5;

public class Worrior implements Unit{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("전사가 달립니다");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("전사가 걷습니다");
	}
	@Override
	public void attack() {
		System.out.println("전사가 검을 휘두릅니다");
	}
	
	
}