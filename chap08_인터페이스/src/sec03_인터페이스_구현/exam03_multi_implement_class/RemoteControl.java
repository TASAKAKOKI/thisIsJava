package sec03_�������̽�_����.exam03_multi_implement_class;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//�߻�޼���� public abstract�� ��������
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}