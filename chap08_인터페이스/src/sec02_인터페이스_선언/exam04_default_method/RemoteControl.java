package sec02_�������̽�_����.exam04_default_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//�߻�޼���� public abstract�� ��������
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//--------���⼭���ʹ� java8���� �߰��� default method
	//defaultŰ����� �ݵ�� �ۼ��� �־�� �Ѵ�.
	//public�� ���������ϴ�.
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
}