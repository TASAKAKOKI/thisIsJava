package sec05_Ÿ�Ժ�ȯ��_������.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//interface Vehicle�� ������ ��ü Bus�� Taxi�� ���� �������ش�.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver��ü�� �޼ҵ� drive(Vehicle vehicle)�� ȣ���Ѵ�.
		//�̶�, �Ű������δ� vehicle �������̽��� ������ � ��ü���� �� �� �ִ�. (�Ű������� ������)
		//�̶�, �Ű������� �־��� ������ü���� vehicle �������̽� ������ �ڵ�Ÿ�Ժ�ȯ�� �̷�����.
		driver.drive(bus);
		driver.drive(taxi);
	}
}