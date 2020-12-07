package sec05_타입변환과_다형성.exam04_casting;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle vehicle =  new Bus();
		
		vehicle.run();
		//아래의 메소드는 구현객체의 메소드이므로, 인터페이스 타입으로 자동타입변환된 상태에서는 호출 불가
		//vehicle.checkFare(); 
		
		//Casting(강제타입변환)
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();//이제는 강제타입변환을 통해 다시 구현객체타입이 되었으므로, 구현객체의 메소드 사용가능
	}
}