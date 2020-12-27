package sec05_표준API의_함수적인터페이스.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",93, 95),
			new Student("신용권", 96, 90)
			);
			
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double engAvg = avg(s -> s.getengScore());
		System.out.println("영어 평균 점수: " + engAvg);
		
		double mathAvg = avg(s -> s.getmathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}