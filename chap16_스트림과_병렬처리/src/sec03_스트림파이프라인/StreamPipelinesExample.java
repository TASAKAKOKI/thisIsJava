package sec03_스트림파이프라인;

import java.util.Arrays;
import java.util.List;
//import java.util.OptionalDouble;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		/*코드로 적지 않은 
		List<Member> list = Arrays.asList();
		Stream<Member> maleFemaleStream = list.stream();
		Stream<Member> maleStream = maleFemaleStream.filter(m -> m.getSex() == Member.MALE);
		IntStream ageStream = maleStream.mapToInt(Member :: getAge);
		OptionalDouble optionalDouble = ageStream.average();
		double ageAvg = optionalDouble.getAsDouble();
		*/
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("파이순", Member.FEMALE, 20),
				new Member("김자바", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
		);
		
		double ageAvg = list.stream()
						.filter(m -> m.getSex()==Member.MALE)
						.mapToInt(Member::getAge)
						.average()
						.getAsDouble();
		System.out.println("남자 회원들의 나이의 평균값: " + ageAvg);
	}
}