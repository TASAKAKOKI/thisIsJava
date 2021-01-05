package sec05_stream_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		/*asDoubleStream()
		 *	IntStream�� int���/ LongStream�� long��Ҹ� double��ҷ� Ÿ�Ժ�ȯ�ؼ� DoubleStream�� ���� 
		 *asLongStream()
		 *	IntStream�� int��Ҹ� long��ҷ� Ÿ�Ժ�ȯ�ؼ� LongStream�� ���� 
		 *boxed()
		 *	int���, long���, double ��Ҹ� Intege,Long,Double��ҷ� �ڽ��ؼ� Stream�� ����
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