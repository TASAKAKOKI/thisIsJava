package sec06.exam01_protected_package2;

//AŬ������ �ִ� ��Ű���ʹ� �ٸ� ��Ű�� �̹Ƿ�,
//AŬ������ �ִ� ��Ű���� import���־�� �Ѵ�.
import sec06.exam01_protected_package1.*;

public class C {
	public void method() {
		//AŬ������ �ٸ� ��Ű�� �ȿ� �ִ� CŬ����������
		//AŬ�������� protected�� ���� ������ ������ �ʵ�, �޼ҵ�� ������ �� ����.
		A a = new A(); //(������ ȣ�� �Ұ�)
		a.field = "value"; //(�ʵ� ���� �Ұ�)
		a.method(); //(�޼ҵ� ȣ�� �Ұ�)
	}
}