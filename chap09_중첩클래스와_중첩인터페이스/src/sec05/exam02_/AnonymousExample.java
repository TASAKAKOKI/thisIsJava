package sec05.exam02_;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//�͸�ü �ʵ带 ���
		anony.parentField.turnOn();
		anony.parentField.turnOff();
		System.out.println("====================");
		//�͸�ü ���ú����� ���
		anony.method1();
		System.out.println("====================");		
		//�͸�ü�� �޼ҵ��� �Ű������� ���
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("�Ű������� �־��� �͸�ü_RemoteControl()��ü�� �߻�޼ҵ带 �������� ��ü�޼ҵ� ȣ��: SmartTV�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("�Ű������� �־��� �͸�ü_RemoteControl()��ü�� �߻�޼ҵ带 �������� ��ü�޼ҵ� ȣ��: SmartTV�� ���ϴ�.");
			}
		});
	}
}