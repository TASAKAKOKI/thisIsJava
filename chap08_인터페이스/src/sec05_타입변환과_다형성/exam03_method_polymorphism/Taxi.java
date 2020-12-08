package sec05_타입변환과_다형성.exam03_method_polymorphism;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}