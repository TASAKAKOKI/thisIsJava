package sec05_Ÿ�Ժ�ȯ��_������.exam04_casting;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle vehicle =  new Bus();
		
		vehicle.run();
		//�Ʒ��� �޼ҵ�� ������ü�� �޼ҵ��̹Ƿ�, �������̽� Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� ���¿����� ȣ�� �Ұ�
		//vehicle.checkFare(); 
		
		//Casting(����Ÿ�Ժ�ȯ)
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();//������ ����Ÿ�Ժ�ȯ�� ���� �ٽ� ������üŸ���� �Ǿ����Ƿ�, ������ü�� �޼ҵ� ��밡��
	}
}