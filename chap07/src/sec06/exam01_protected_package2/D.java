package sec06.exam01_protected_package2;

//AŬ������ �ִ� ��Ű���ʹ� �ٸ� ��Ű�� �̹Ƿ�,
//AŬ������ �ִ� ��Ű���� import���־�� �Ѵ�.
import sec06.exam01_protected_package1.*;

public class D extends A {
	public D() {
		//AŬ������ �ٸ� ��Ű�� �ȿ� �ִ� DŬ������ 
		//��� �ٸ� ��Ű�� �ȿ� ������, AŬ������ ����Ͽ��� ������,
		//AŬ�������� protected�� ���� ������ ������ �ʵ�, �޼ҵ�� ������ �� �ִ�.
		super(); //(�θ� Ŭ������ ������ ȣ��)
		this.field = "value"; //(�θ� Ŭ������ �ʵ� ����)
		this.method(); //(�θ� Ŭ������ �޼ҵ� ȣ��)
	}
}