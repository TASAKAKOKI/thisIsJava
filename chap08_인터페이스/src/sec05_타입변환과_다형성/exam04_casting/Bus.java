package sec05_Ÿ�Ժ�ȯ��_������.exam04_casting;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	//�������̽��ʹ� �������, ������ü���� �޼ҵ嵵 �������ش�.
	//�� �޼ҵ�� �������̽��� �ִ� �߻�޼ҵ尡 �ƴϹǷ�,
	//�������̽� Ÿ������ �ڵ���ȯ�� �Ŀ��� ���� �� ����.
	//����Ÿ�Ժ�ȯ�� �̷����� �ٽ� �� �� �ִ�.
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}