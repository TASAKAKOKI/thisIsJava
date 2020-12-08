package sec05_타입변환과_다형성.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("===타이어 교체를 시작합니다.===");
		myCar.frontLeftTire = new KumTire();
		myCar.backRightTire = new KumTire();
		System.out.println("===타이어 교체가 끝났습니다.===");
		myCar.run();
	}
}