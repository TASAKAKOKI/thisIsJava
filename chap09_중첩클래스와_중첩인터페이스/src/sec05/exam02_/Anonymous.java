package sec05.exam02_;

public class Anonymous {
	//�ʵ� �ʱⰪ���� �͸��ڽİ�ü ����
	RemoteControl parentField = new RemoteControl() {
		/*�͸�ü �������� RemoteControl �������̽��� ���ǵ� ��� �߻�޼ҵ带 �������� ��ü�޼ҵ带 �����ϰ� �ʱ�ȭ ���־�� �Ѵ�.
		*/
		@Override
		public void turnOn() {
			System.out.println("�͸�ü �ʵ�_�������̽��� �߻�޼ҵ��� ��ü�޼ҵ� turnOn() ȣ��");
		}
		@Override
		public void turnOff() {
			System.out.println("�͸�ü �ʵ�_�������̽��� �߻�޼ҵ��� ��ü�޼ҵ� turnOff() ȣ��");			
		}
	};
	
	void method1() {
		//���� ���������� �͸��ڽİ�ü ����
		RemoteControl parentLocalValue = new RemoteControl() {
			/*����������, �͸�ü �������� RemoteControl �������̽��� ���ǵ� ��� �߻�޼ҵ带 �������� ��ü�޼ҵ带 �����ϰ� �ʱ�ȭ ���־�� �Ѵ�.
			*/
			@Override
			public void turnOn() {
				System.out.println("�͸�ü ���ú���_�������̽��� �߻�޼ҵ��� ��ü�޼ҵ� turnOn() ȣ��");
			}
			@Override
			public void turnOff() {
				System.out.println("�͸�ü ���ú���_�������̽��� �߻�޼ҵ��� ��ü�޼ҵ� turnOff() ȣ��");						
			}
		};
		//���� ���� ���
		parentLocalValue.turnOn();
		parentLocalValue.turnOff();
	}
	
	//�޼ҵ��� �Ű������� RemoteControl�������̽��� ������ ������ü�� �� �� �ִµ�, �̶����� ���� �͸�ü�� �����Ͽ� �Ű������� �� �� �ִ�.
	void method2(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
}