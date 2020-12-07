package sec05_타입변환과_다형성.exam01_interface_field_polymorphism;

public class Car {
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new HanTire();
	Tire backRightTire = new HanTire();
	
	void run() {
		//축약형 for문을 사용하면 편리하다.
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}