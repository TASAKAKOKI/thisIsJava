package sec05_Ÿ�Ժ�ȯ��_������.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("===Ÿ�̾� ��ü�� �����մϴ�.===");
		myCar.frontLeftTire = new KumTire();
		myCar.backRightTire = new KumTire();
		System.out.println("===Ÿ�̾� ��ü�� �������ϴ�.===");
		myCar.run();
	}
}