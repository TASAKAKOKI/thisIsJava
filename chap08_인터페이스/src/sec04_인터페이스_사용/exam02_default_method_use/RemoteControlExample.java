package sec04_인터페이스_사용.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스로 구현 객체를 사용하려면,
		//인터페이스 변수를 선언하고, 구현 객체를 대입해준다.
		//1 인터페이스 변수 선언,
		RemoteControl rc = null;
		//2-1 인터페이스 변수에 Television 구현 객체 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		/*
		아래의 메소드 호출은 불가하다.
		인터페이스는 객체가 아니므로,		
		RemoteControl.setMute(true);
		*/
		
		//2-2 인터페이스 변수에 Audio 구현 객체 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
	}

}
