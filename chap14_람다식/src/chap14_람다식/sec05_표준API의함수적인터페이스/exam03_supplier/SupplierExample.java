package chap14_람다식.sec05_표준API의함수적인터페이스.exam03_supplier;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {String str = "Java 8"; return str;};
		String str = supplier.get();
		System.out.println("람다식이 도입된 자바 버전: " + str);
		
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num; //IntSupplier인터페이스를 구현하므로, 반드시 int값을 리턴하도록 한다.
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("주사위 눈의 수: " + num);
	}
}