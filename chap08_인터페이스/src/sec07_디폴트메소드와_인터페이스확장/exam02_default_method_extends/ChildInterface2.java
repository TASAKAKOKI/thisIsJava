package sec07_����Ʈ�޼ҵ��_�������̽�Ȯ��.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	//�� �������̽��� ParentInterface�� default�޼ҵ带 ������ �Ͽ� ���
	@Override
	default void method2() {
		System.out.println("ChildInterface-method2() ����");
	}
	//ChildInterface2���� �߻�޼ҵ� ����
	void method3();
}
