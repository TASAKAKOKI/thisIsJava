package sec05_Ÿ�Ժ�ȯ��_������.exam01_interface_field_polymorphism;

public class Car {
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new HanTire();
	Tire backRightTire = new HanTire();
	
	void run() {
		//����� for���� ����ϸ� ���ϴ�.
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}