package sec05_Ÿ�Ժ�ȯ��_������.exam02_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("===Ÿ�̾� ��ü�� �����մϴ�.===");
		myCar.tires[0] = new KumTire();
		myCar.tires[3] = new KumTire();
		System.out.println("===Ÿ�̾� ��ü�� �������ϴ�.===");
		myCar.run();
	}

}