package sec05_표준API의_함수적인터페이스.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("박한나", "여자", 95),
			new Student("한동근", "남자", 92),
			new Student("하이눈", "남자", 88)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0; //같은 타입의 변수 여러개를 선언하는 경우, 콤마(,)로 변수 명만 나열해 주어도 된다.
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
		
	}
	public static void main(String[] args) {
		//함수적인터페이스 Predicate에 대한 람다식을 매개값으로 제공
		double maleAvg = avg(s -> s.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = avg(s -> s.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);		
	}
}