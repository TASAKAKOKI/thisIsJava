package sec03_�������̽�_����.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		//�������̽��� ���� ��ü�� ����Ϸ���,
		//�������̽� ������ �����ϰ�, ���� ��ü�� �������ش�.
		//1 �������̽� ���� ����,
		RemoteControl rc;
		//2-1 �������̽� ������ Television ���� ��ü ����
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		//2-2 �������̽� ������ Audio ���� ��ü ����
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
	}

}
