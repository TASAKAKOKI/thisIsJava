package sec06.exam01_protected_package1;

public class B {
	public void method() {
		//AŬ������ ���� ��Ű�� �ȿ� �ִ� BŬ����������
		//AŬ�������� protected�� ���� ������ ������ �ʵ�, �޼ҵ�� ������ �� �ִ�.
		A a = new A();
		a.field = "value";
		a.method();
	}
}