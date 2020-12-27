package sec03_Ÿ��Ÿ�԰�_�Լ����������̽�.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi;
		mfi = () -> {
			System.out.println("MyFunctionalInterface ���� ��ü�� method() ����");
		};
		mfi.method();
		
		//�Ʒ��� �� �ۼ����� �����ϴ�.
		//��, ���๮�� �ϳ��� ��� {} ���� ����
		mfi = () -> { System.out.println("method call2"); };
		mfi.method();
		mfi = () -> System.out.println("method call3");
		mfi.method();
		
		//���ٽ� ������� �ʰ�, �͸� ���� ��ü�� �����Ͽ� �޼ҵ� ȣ���ϱ�
		mfi = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("method call4");
			}
		};
		mfi.method();
	}
}