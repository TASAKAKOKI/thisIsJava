package sec05_타입변환과_다형성.exam01_interface_field_polymorphism;

public class KumTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}