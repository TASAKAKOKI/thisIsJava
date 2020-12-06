package sec03_인터페이스_구현.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		//인터페이스로 구현 객체를 사용하려면,
		//인터페이스 변수를 선언하고, 구현 객체를 대입해준다.
		//1 인터페이스 변수 선언,
		RemoteControl rc;
		//2-1 인터페이스 변수에 Television 구현 객체 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		//2-2 인터페이스 변수에 Audio 구현 객체 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
	}

}
