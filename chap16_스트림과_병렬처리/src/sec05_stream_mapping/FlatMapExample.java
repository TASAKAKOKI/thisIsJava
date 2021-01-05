package sec05_stream_mapping;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		/*Mapping
		 *	중간 처리 기능으로 스트림의 요소를 다른 요소(들)로 대체한다.
		 *mapping메소드의 종류
		 *	flatXXX()와 mapXXX(), asDoubleStream(),asLongStream(),boxed() 등
		 *flatMapXXX()메소드
		 *	한 개의 요소를 대체하는 복수개의 요소들로 구성된 새로운 스트림을 리턴한다.
		 */
		List<String> inputList1 = Arrays.asList(
				"java9 lambda", "stream mapping"
		);
		
		inputList1.stream() // Stream<String>을 반환
				  .flatMap(data -> Arrays.stream(data.split(" ")))
				  .forEach(System.out::println);
		System.out.println();
		
		List<String> inputList2 =  Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()
				  .flatMapToInt(data -> {
					  String[] strArr = data.split(",");
					  int[] intArr = new int[strArr.length];
					  for(int i=0; i<strArr.length;i++) {
						  intArr[i] = Integer.parseInt(strArr[i].trim());
					  }
					  return Arrays.stream(intArr);
				  })
				  .forEach(number -> System.out.println(number));
		
		
	}
}