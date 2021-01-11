package sec04_동기화_메소드와_동기화_블록.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator(); //공유객체 생성
		
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
	}
}