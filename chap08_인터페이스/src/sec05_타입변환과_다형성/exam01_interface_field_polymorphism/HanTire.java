package sec05_타입변환과_다형성.exam01_interface_field_polymorphism;

public class HanTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}