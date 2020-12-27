package sec05_ǥ��API��_�Լ����������̽�.exam09_minBy_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		//minBy()�� maxBy()�޼ҵ�� BinaryOperator<T>�������̽��� ���� �޼ҵ��̴�.
		
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		//Comparator<T>�� o1�� o2�� ���ؼ�, o1�� ������ ����, ������ 0, o1�� ũ�� ����� �����ؾ��ϴ� compare()�޼ҵ尡 ���ǵǾ� �ִ� �Լ����������̽��̴�.
		/*
		 * @FunctionalInterface
		 * public interface Comparator<T> {
		 * 		public int compare(T o1, T o2);
		 * */
		//���� o1,o2�� int Ÿ���̶��, Integer.compare(o1,o2)�� ����ص� �ȴ�.		
		binaryOperator = BinaryOperator.minBy( (f1, f2) -> Integer.compare(f1.price, f2.price) );
		fruit = binaryOperator.apply( new Fruit("������", 5000), new Fruit("���", 6900) );
		System.out.println("�� ����: " + fruit.name + " = " + fruit.price + "��");
		
		binaryOperator = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.price, f2.price) );
		fruit = binaryOperator.apply( new Fruit("������", 5000), new Fruit("���", 6900) );
		System.out.println("��� ����: " + fruit.name + " = " + fruit.price + "��");
	}
}