package sec05_stream_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		/*asDoubleStream()
		 *	IntStream의 int요소/ LongStream의 long요소를 double요소로 타입변환해서 DoubleStream을 생성 
		 *asLongStream()
		 *	IntStream의 int요소를 long요소로 타입변환해서 LongStream을 생성 
		 *boxed()
		 *	int요소, long요소, double 요소를 Intege,Long,Double요소로 박싱해서 Stream을 생성
		 */
		int[] intArr = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArr);
		
		intStream.asDoubleStream().forEach(System.out::println);
		System.out.println();
		
		intStream = Arrays.stream(intArr);
		intStream.boxed()
				 .forEach(obj -> System.out.println(obj));
		
	}
}