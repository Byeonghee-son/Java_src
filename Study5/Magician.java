package Study5;

public class Magician implements Unit{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 달립니다");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 걷습니다");
	}
	@Override
	public void attack() {
		System.out.println("마법사가 메테오를 소환합니다");
	}
	
	
}


