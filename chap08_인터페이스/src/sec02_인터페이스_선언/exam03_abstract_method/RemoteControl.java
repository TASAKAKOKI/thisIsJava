package sec02_인터페이스_선언.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;

	//인터페이스의 추상메소드는 메소드 선언부이며,
	//메소드를 호출하는 방법만 정의한다.
	//실게 메소드는 객체에서 재정의되고, 메서드 호출시, 재정의된 메서드가 호출된다.
	//public abstract은 생략가능하다.
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}