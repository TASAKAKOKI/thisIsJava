package sec02_�������̽�_����.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;

	//�������̽��� �߻�޼ҵ�� �޼ҵ� ������̸�,
	//�޼ҵ带 ȣ���ϴ� ����� �����Ѵ�.
	//�ǰ� �޼ҵ�� ��ü���� �����ǵǰ�, �޼��� ȣ���, �����ǵ� �޼��尡 ȣ��ȴ�.
	//public abstract�� ���������ϴ�.
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}