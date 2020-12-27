package sec06_�޼ҵ�����.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//���� �޼ҵ� ����
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("��� 1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod; // ::�տ� Ŭ������ ���� ��� - ���� �޼ҵ带 �����ϴ� ���,
		System.out.println("�ᰡ 2: " + operator.applyAsInt(3, 4));
		
		//�ν��Ͻ� �޼ҵ� ����
		Calculator obj = new Calculator(); //�ν��Ͻ� ��ü�� ���� �����ؾ� �Ѵ�.
		
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("��� 3: " + operator.applyAsInt(5, 6));
		 
		operator = obj :: instanceMethod; // :: �տ� �ν��Ͻ���ü���� ���� ��� - �ν��Ͻ� �޼ҵ带 �����ϴ� ���,
		System.out.println("��� 4: " + operator.applyAsInt(7, 8));
	}
}