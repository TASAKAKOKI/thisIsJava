package sec04_����ȭ_�޼ҵ��_����ȭ_���.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator(); //������ü ����
		
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
	}
}