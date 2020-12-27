package sec03_Ÿ��Ÿ�԰�_�Լ����������̽�.exam03_with_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi;
		mfi = (int x, int y) -> {
			return x+y;
		};
		int result1 = mfi.method(1,1);
		System.out.println("result1: " + result1);
		
		//�Ű������� 2�� �̻��� ��쿡�� ()�� ������ �� ����.
		//return�� �ϳ��� �ִ� ��� {}�� return Ű���� ��� ��������
		mfi = (x,y) -> { return x+y; };
		int result2 = mfi.method(2,2);
		System.out.println("result2: " + result2);
		
		mfi = (x,y) -> x+y;
		int result3 = mfi.method(3,3);
		System.out.println("result3: " + result3);
		
		//���ϰ��� �Լ� �̿��ϱ�
		mfi = (x,y) -> sum(x,y);
		int result4 = mfi.method(4,4);
		System.out.println("result4: " + result4);
	
		//���� ���ٽ� ǥ�������� ��� �Ʒ��� ���� �͸�����ü�� �����ϴ� �Ͱ� �����ϴ�.
		mfi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		int result5 = mfi.method(5,5);
		System.out.println("result5: " + result5);
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
}