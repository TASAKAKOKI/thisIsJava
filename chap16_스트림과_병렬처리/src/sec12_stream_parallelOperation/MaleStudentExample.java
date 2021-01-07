package sec12_stream_parallelOperation;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿",10,Student.Sex.MALE),
				new Student("���̼�",6,Student.Sex.FEMALE),
				new Student("���ڹ�",10,Student.Sex.MALE),
				new Student("������",6,Student.Sex.FEMALE)
		);
		MaleStudent maleStudent = totalList.parallelStream()
											.filter(s->s.getSex()==Student.Sex.MALE)
											.collect(MaleStudent::new, MaleStudent::accumulate,MaleStudent::combine);
		maleStudent.getList().stream()
							.forEach(s->System.out.println(s.getName()));
	}
}