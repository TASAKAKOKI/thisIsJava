package sec02_인터페이스_선언.exam05_static_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//추상메서드는 public abstract이 생략가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//--------여기서부터는 java8부터 추가된 default method
	//default키워드는 반드시 작성해 주어야 한다.
	//public은 생략가능하다.	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//--------여기서부터는 java8부터 추가된 static method
	//static 키워드 필요
	//public은 생략가능
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}