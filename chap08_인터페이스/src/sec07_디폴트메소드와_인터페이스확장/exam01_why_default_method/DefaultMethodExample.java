package sec07_����Ʈ�޼ҵ��_�������̽�Ȯ��.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		//������ MyClassA�� ������ �������̽��� �޼ҵ常 ��밡���ϰ�,
		//������ ���� �ʾ����Ƿ�, ���� ���Ӱ� �߰��� ����Ʈ �޼ҵ带 ����Ѵٸ�,
		//�������̽��� ���ǵ� �޼ҵ� �������� ����ȴ�.
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		//MyClassB�� ����Ʈ �޼ҵ带 �������Ͽ� ���.
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
