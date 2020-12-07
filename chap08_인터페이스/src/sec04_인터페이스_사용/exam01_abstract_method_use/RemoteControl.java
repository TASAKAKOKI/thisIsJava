package sec04_인터페이스_사용.exam01_abstract_method_use;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//추상메서드는 public abstract이 생략가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//--------여기서부터는 java8부터 추가된 default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	//--------여기서부터는 java8부터 추가된 static method
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}