package sec08.exam01_abstract_class;

//추상 클래스 Phone을 생성
public abstract class Phone {
	//필드정의
	public String owner;
	//생성자 정의
	public Phone(String owner) {
		this.owner = owner;
	}
	//메소드 정의
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
