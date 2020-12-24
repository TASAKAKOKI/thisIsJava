package sec06_���ϵ�ī��Ÿ��.exam01_genericWildCard;

import java.util.Arrays;

public class WildCardExample {
	/*��� Ÿ���� Course��ü�� �� �� �ִ�.*/
	public static void registerCourse( Course<?> course ) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	/*StudentŬ���� �Ǵ� �� ���� Ŭ������ ��ü�� �� �� �ִ�.*/
	public static void registerCourseStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	/*WorkerŬ���� �Ǵ� �� ���� Ŭ������ ��ü�� �� �� �ִ�.*/
	public static void registerCourseWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		System.out.println("*****				�׽��� ��				*****");
		registerCourse(new Course<Person>("�Ϲ��� ����	 ",5));
		registerCourse(new Course<Worker>("������ ����	 ",5));
		registerCourse(new Course<Student>("�л� ����	 ",5));
		registerCourse(new Course<HighStudent>("����л� ����",5));
		System.out.println("*****			registerCourse�� ��� ��ü ���� ����		*****");
		
		//registerCourseStudent(new Course<Person>("�Ϲ��� ����  ",5));
		//registerCourseStudent(new Course<Worker>("������ ����  ",5));
		registerCourseStudent(new Course<Student>("�л� ����	 ",5));
		registerCourseStudent(new Course<HighStudent>("����л� ����",5));
		System.out.println("***** registerCourseStudent���� Person��ü�� Worker��ü�� ���� �Ұ�	*****");
		
		registerCourseWorker(new Course<Person>("�Ϲ��� ����  ",5));
		registerCourseWorker(new Course<Worker>("������ ����  ",5));
		//registerCourseWorker(new Course<Student>("�л� ����	 ",5));
		//registerCourseWorker(new Course<HighStudent>("����л� ����",5));
		System.out.println("***** registerCourseStudent���� Person��ü�� Worker��ü�� ���� ����	*****");
		
		
		
		Course<Person> personCourse = new Course("�Ϲ��� ����", 5); //ũ�Ⱑ 5�̸�, "�Ϲ��ΰ���"�̶�� �̸��� ����, <Person>Ÿ���� ��ü�� �̷��� �迭�� ���� Course��ü�� ����
			personCourse.add(new Person("�Ϲ���1"));
			personCourse.add(new Person("������1"));
			personCourse.add(new Person("�л�1"));
			personCourse.add(new Person("����л�1"));
			
		Course<Worker> workerCourse = new Course("������ ����", 5);
			workerCourse.add(new Worker("������2"));
			
		Course<Student> studentCourse = new Course("�л� ����", 5);
			studentCourse.add(new Student("�л�2"));
			studentCourse.add(new Student("����л�2"));

		Course<HighStudent> highStudentCourse = new Course("����л� ����", 5);
			highStudentCourse.add(new HighStudent("����л�3"));	
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highStudentCourse);
	}
}