package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartP = new SmartPhone("김자바");
		//Phone객체는 추상클래스이므로, 생성자를 호출할 수 없다.
		//추상클래스는 객체 생성이 아닌, 자식 객체로의 상속을 위해서만 사용된다.
		//Phone P = new Phone("김파이썬");
		
		smartP.turnOn();
		System.out.println("이 스마트폰의 주인은 " + smartP.owner + "입니다."); 
		smartP.internetSearch();
		smartP.turnOff();
	}

}
