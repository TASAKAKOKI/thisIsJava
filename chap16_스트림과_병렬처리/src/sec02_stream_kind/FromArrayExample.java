package sec02_stream_kind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArr = {"ȫ�浿", "���ڹ�", "���̼�"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		int[] intArr = {1,5,4,3,2};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(i->System.out.print(i + " "));
		System.out.println();
	}
}