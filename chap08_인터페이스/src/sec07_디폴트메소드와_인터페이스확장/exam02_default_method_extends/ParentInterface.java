package sec07_����Ʈ�޼ҵ��_�������̽�Ȯ��.exam02_default_method_extends;

public interface ParentInterface {
	void method1();
	default void method2() {
		System.out.println("ParentInterface-method2()����");
	}
}
