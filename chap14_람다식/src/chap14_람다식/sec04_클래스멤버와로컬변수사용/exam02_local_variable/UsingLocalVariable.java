package chap14_���ٽ�.sec04_Ŭ��������ͷ��ú������.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// �Ʒ��� �ʱ�ȭ�� ��� finalƯ������ �����߻�
		// arg = 20;
		// localVar = 20;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar); //���ٽ� ������ ���ú��� localVAR�� �Ű����� arg�� ���Ǿ����Ƿ�, �� ���� final Ư���� ���� �Ǿ� ������ �Ұ�������.
		};
		fi.method();
	}
}