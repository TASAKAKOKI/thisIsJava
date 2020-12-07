package sec04_�������̽�_���.exam01_abstract_method_use;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//�߻�޼���� public abstract�� ��������
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//--------���⼭���ʹ� java8���� �߰��� default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	//--------���⼭���ʹ� java8���� �߰��� static method
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}