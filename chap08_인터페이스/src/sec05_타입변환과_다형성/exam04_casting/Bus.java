package sec05_타입변환과_다형성.exam04_casting;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//인터페이스와는 상관없는, 구현객체만의 메소드도 정의해준다.
	//이 메소드는 인터페이스에 있는 추상메소드가 아니므로,
	//인터페이스 타입으로 자동변환된 후에는 사용될 수 없다.
	//강제타입변환이 이뤄지면 다시 쓸 수 있다.
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}