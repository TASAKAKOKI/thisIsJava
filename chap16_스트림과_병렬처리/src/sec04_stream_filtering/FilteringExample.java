package sec04_stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"홍길동","신용권","김자바","홍길동","신용권","파이선","신민철");
		/*distinct()
		 *	Stream: equals()메소드가 true가 나오면 동일한 객체로 판단하고 중복을 제거
		 *	IntStream, LongStream, DoubleStream: 동일값일 경우 중복을 제거
		 */
		names.stream()
			 .distinct()
			 .forEach(System.out :: println);
		System.out.println();

		/*filter()
		 * 	매개값으로 주어진 Predicate함수적 인터페이스가 true를 리턴하는 요소만 필터링
		 */
		names.stream()
			 .filter(n -> n.startsWith("신"))
			 .forEach(System.out::println);
		System.out.println();
		
		/*distinct()와 filter()모두 처리*/
		names.stream()
			 .distinct()
			 .filter(n -> n.startsWith("신"))
			 .forEach(n -> System.out.println(n));
	}
}