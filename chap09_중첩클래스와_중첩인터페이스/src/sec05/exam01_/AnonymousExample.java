package sec05.exam01_;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸�ü �ʵ带 ���
		anony.parentField.wake();
		
		//�͸�ü ���ú����� ���
		anony.method1();
		
		//�͸�ü�� �޼ҵ��� �Ű������� ���
		anony.method2(new Person() {
			void study() {
				System.out.println("�Ű������� �־��� �͸�ü_�͸�ü�� �޼ҵ�ȣ��: ���θ� �մϴ�.");
			}
			
			@Override
			public void wake() {
				System.out.println("�Ű������� �־��� �͸�ü_Person()��ü�� �⺻�޼ҵ� ȣ��: ���ÿ� �Ͼ���ϴ�.");
				study();
			}
		});
	}
}