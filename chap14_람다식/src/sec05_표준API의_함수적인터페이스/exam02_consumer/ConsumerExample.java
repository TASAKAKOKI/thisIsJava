package sec05_표준API의_함수적인터페이스.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		//Consumer<T>인터페이스를 통해, 추상메소드 void accept(T t)를 사용함
		//타입파라미터 T가 String으로 정의되어 있으므로, 매개값 t를 String타입이 된다.
		Consumer<String> consumer = t -> System.out.println(t + " 8");
		consumer.accept("Java");
		
		BiConsumer<String,Integer> biConsumer = (t,u) -> System.out.println(t + " " + u);
		biConsumer.accept("Java",  8);
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + " " + i);
		objIntConsumer.accept("Java", 8);
	}
}