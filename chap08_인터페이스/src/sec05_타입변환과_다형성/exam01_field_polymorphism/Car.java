package sec05_Ÿ�Ժ�ȯ��_������.exam01_field_polymorphism;

public class Car {
	//�ʵ��� ����������
	//�ʵ�Ÿ���� Tire�̳�, �� �ʵ庯���� ���ԵǴ� ��ü�� Tire�� ��ӹ��� ���� ������ü�� �� �� �ִ�.
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