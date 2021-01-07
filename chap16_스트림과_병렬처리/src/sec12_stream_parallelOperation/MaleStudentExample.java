package sec12_stream_parallelOperation;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("È«±æµ¿",10,Student.Sex.MALE),
				new Student("ÆÄÀÌ¼ø",6,Student.Sex.FEMALE),
				new Student("±èÀÚ¹Ù",10,Student.Sex.MALE),
				new Student("±èÈñÁø",6,Student.Sex.FEMALE)
		);
		MaleStudent maleStudent = totalList.parallelStream()
											.filter(s->s.getSex()==Student.Sex.MALE)
											.collect(MaleStudent::new, MaleStudent::accumulate,MaleStudent::combine);
		maleStudent.getList().stream()
							.forEach(s->System.out.println(s.getName()));
	}
}