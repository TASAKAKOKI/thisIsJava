package sec05_타입변환과_다형성.exam05_instanceOf;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle vehicle =  new Bus();
		
		Driver driver = new Driver();
		driver.drive(vehicle);
	}
}