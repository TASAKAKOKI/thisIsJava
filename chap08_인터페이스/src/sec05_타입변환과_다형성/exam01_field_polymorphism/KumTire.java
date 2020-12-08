package sec05_타입변환과_다형성.exam01_field_polymorphism;

public class KumTire implements Tire {
	//상속받은 Tire 인터페이스의 추상메소드를 재정의해주어야 한다.
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}