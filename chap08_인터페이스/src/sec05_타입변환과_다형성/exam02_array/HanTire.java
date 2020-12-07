package sec05_타입변환과_다형성.exam02_array;

public class HanTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}