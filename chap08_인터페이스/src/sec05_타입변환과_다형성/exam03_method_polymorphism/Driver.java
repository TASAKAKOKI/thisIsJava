package sec05_타입변환과_다형성.exam03_method_polymorphism;

public class Driver {
	//매개값으로는 Vehicle인터페이스의 구현객체가 아무것이든 주어질 수 있다.
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}