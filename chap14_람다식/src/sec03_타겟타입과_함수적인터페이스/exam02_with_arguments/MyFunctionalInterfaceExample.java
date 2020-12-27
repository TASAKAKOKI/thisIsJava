package sec03_Ÿ��Ÿ�԰�_�Լ����������̽�.exam02_with_arguments;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi;
		mfi = (int x) -> {
			System.out.println("method call1 result: " + x*2);
		};
		mfi.method(1);
		
		//�Ʒ��� �� �ۼ����� �����ϴ�.
		//��, �Ű�Ÿ���� ���� �ʾƵ� �Ǹ�, �Ű����� �ϳ��� ��� ()���� ����
		mfi = (x) -> { System.out.println("method call2 result: " + x*2); };
		mfi.method(2);
		mfi = x -> System.out.println("method call3 result: " + x*2);
		mfi.method(3);
		
		//���ٽ� ������� �ʰ�, �͸� ���� ��ü�� �����Ͽ� �޼ҵ� ȣ���ϱ�
		mfi = new MyFunctionalInterface() {
			@Override
			public void method(int x) {
				System.out.println("method call4 result: " + x*2);
			}
		};
		mfi.method(4);
	}
}