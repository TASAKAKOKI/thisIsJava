package sec09_stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*위의 코드는 NotSuchElementExeception 예외가 발생한다.
		double avg = list.stream()
						 .mapToInt(Integer :: intValue)
						 .average()
						 .getAsDouble();
		스트림을 생성시 요소들이 존재하지 않기 때문이다.
		*/
		
		OptionalDouble optional = list.stream()
									  .mapToInt(Integer::intValue)
									  .average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_default평균: " + 0.0);
		}
		
		double avg = list.stream()
						 .mapToInt(Integer::intValue)
						 .average()
						 .orElse(0.0); //.average()에서 Exception이 발생하면, 0.0을 반환, 그렇지 않을 경우 정상적인 double값을 반환
		System.out.println("방법2_평균: " + avg);
		
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a->System.out.println("방법3-1_평균: " + a)); //값이 있는 경우에만 실행(실행되지 않음)
		
		list.add(3);
		list.add(8);
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a->System.out.println("방법3-2_평균: " + a)); //값이 있는 경우에만 실행(실행됨)
	}
}