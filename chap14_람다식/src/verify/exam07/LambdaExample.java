package verify.exam07;

import java.util.function.Function;
import java.util.function.ToIntFunction;

//exam06의 클래스에서 avg()를 호출할 때, 매개값으로 준 람다식을 메소드 참조로 변경하기
public class LambdaExample {
	public static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("김자바", 95, 93)
	};
	
	//avg메소드 작성1
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		return sum / students.length;
	}

	/*
	//avg메소드 작성2
	public static double avg(Function<Student,Integer> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student);
		}
		return sum / students.length;
	}
	*/
	
	public static void main(String[] args) {
		double engScoreAvg = avg( Student :: getEngScore );
		System.out.println("영어 평균 점수: " + engScoreAvg);
		
		double  mathScoreAvg = avg( Student :: getMathScore );
		System.out.println("수학 평균 점수: " + mathScoreAvg);
	}
}