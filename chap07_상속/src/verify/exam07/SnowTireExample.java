package verify.exam07;

public class SnowTireExample {
	public static void main(String args[]) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //자동타입변환
		
		snowTire.run();
		tire.run();
	}
}
/*
예상결과:
스노우 타이어가 굴러갑니다.
스노우 타이어가 굴러갑니다.
*/