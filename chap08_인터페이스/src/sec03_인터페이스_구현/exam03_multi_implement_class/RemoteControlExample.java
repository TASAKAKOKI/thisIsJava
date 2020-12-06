package sec03_인터페이스_구현.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String args[]) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		Searchable schble = tv;
		schble.search("http://naver.com");
	}
}