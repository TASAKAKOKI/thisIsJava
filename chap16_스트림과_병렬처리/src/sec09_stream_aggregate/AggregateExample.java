package sec09_stream_aggregate;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5의 인트배열을 인트스트림으로 생성
						  .filter(n->n%2==0) //2의 배수만으로 이뤄진 intStream생성 (중간처리)
						  .count(); //2의 배수만으로 이뤄진 intStream의 요소 개수 카운팅
		System.out.println("2의 배수의 개수: " + count);
	
		long sum = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5의 인트배열을 인트스트림으로 생성
					     .filter(n->n%2==0) //2의 배수만으로 이뤄진 intStream생성 (중간처리)
					     .sum(); //2의배수만으로 이뤄진 intStream의 요소들의 합을 반환
		System.out.println("2의 배수의 합: " + sum);		

		int max = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5의 인트배열을 인트스트림으로 생성
					    .filter(n->n%2==0) //2의 배수만으로 이뤄진 intStream생성 (중간처리)
					    .max() //2의 배수만으로 이뤄진 intStream중 가장 큰 값을 반환 (OptionalInt타입)
					    .getAsInt(); //OptionaInt에서 int타입을 얻어냄
		System.out.println("2의 배수 중 최대값: " + max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5의 인트배열을 인트스트림으로 생성
					    .filter(n->n%2==0) //2의 배수만으로 이뤄진 intStream생성 (중간처리)
					    .min() //2의 배수만으로 이뤄진 intStream중 가장 작은 값을 반환 (OptionalInt타입)
					    .getAsInt(); //OptionaInt에서 int타입을 얻어냄
		System.out.println("2의 배수 중 최대값: " + min);
		
		int first3 = Arrays.stream(new int[] {1,2,6,4,5,3}) //1,2,3,4,5의 인트배열을 인트스트림으로 생성
						   .filter(n->n%3==0) //3의 배수만으로 이뤄진 intStream생성 (중간처리)
						   .findFirst() //3의 배수만으로 이뤄진 intStream중 가장 첫번째 3의 배수를 반환 (OptionalInt타입)
						   .getAsInt(); //OptionaInt에서 int타입을 얻어냄
		System.out.println("첫번째 3의 배수: " + first3);
		
	}
}