package sec01_stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class _01_IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김자바","파이썬","디벨로퍼");
		
		System.out.println("[Iterator 이용]");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("\n[Stream 이용]");		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name)); //stream.forEach()메소드는 (Consumer<? super T> action )를 매개값으로 받는다.
		//Consumer는 매개값을 소비하는 함수적 인터페이스이다.
	}
}