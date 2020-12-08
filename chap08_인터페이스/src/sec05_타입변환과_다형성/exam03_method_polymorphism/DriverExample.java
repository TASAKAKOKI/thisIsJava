package sec05_타입변환과_다형성.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//interface Vehicle을 구현한 객체 Bus와 Taxi를 각각 생성해준다.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver객체의 메소드 drive(Vehicle vehicle)을 호출한다.
		//이때, 매개값으로는 vehicle 인터페이스를 구현한 어떤 객체든지 올 수 있다. (매개변수의 다형성)
		//이때, 매개값으로 주어진 구현객체들은 vehicle 인터페이스 변수로 자동타입변환이 이뤄진다.
		driver.drive(bus);
		driver.drive(taxi);
	}
}