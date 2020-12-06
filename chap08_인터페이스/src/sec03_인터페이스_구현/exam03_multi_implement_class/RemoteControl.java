package sec03_인터페이스_구현.exam03_multi_implement_class;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//추상메서드는 public abstract이 생략가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}