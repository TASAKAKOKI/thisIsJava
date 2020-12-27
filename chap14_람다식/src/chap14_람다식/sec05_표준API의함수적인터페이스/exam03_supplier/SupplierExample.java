package chap14_���ٽ�.sec05_ǥ��API���Լ����������̽�.exam03_supplier;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {String str = "Java 8"; return str;};
		String str = supplier.get();
		System.out.println("���ٽ��� ���Ե� �ڹ� ����: " + str);
		
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num; //IntSupplier�������̽��� �����ϹǷ�, �ݵ�� int���� �����ϵ��� �Ѵ�.
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("�ֻ��� ���� ��: " + num);
	}
}