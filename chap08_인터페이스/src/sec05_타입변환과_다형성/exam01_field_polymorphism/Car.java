package sec05_타입변환과_다형성.exam01_field_polymorphism;

public class Car {
	//필드의 다형성적용
	//필드타입은 Tire이나, 이 필드변수에 대입되는 객체는 Tire를 상속받은 여러 구현객체가 올 수 있다.
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new HanTire();
	Tire backRightTire = new HanTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}