package sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;

public class _04_MapAndReduceExample {
	public static void main(String[] args) {
		List<_02_Student> list = Arrays.asList(
				new _02_Student("홍길동",10),
				new _02_Student("스트림",20),
				new _02_Student("김자바",30)
				);
		double avg = list.stream() //original스트림을 얻음
				.mapToInt(_02_Student :: getScore) // 학생객체를 갖는 오리지날 스트림을 점수(int)를 요소로 갖는 스트림으로 (매핑)
				.average() //평균값을 구함. OptionalDouble을 반환하므로, 
				.getAsDouble(); // double로 변환해준다.
		System.out.println("평균 점수: " + avg);
	}
}