package sec06_와일드카드타입.exam01_genericWildCard;

import java.util.Arrays;

public class WildCardExample {
	/*어떠한 타팁의 Course객체라도 올 수 있다.*/
	public static void registerCourse( Course<?> course ) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	/*Student클래스 또는 그 하위 클래스의 객체만 올 수 있다.*/
	public static void registerCourseStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	/*Worker클래스 또는 그 상위 클래스의 객체만 올 수 있다.*/
	public static void registerCourseWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		System.out.println("*****				테스팅 중				*****");
		registerCourse(new Course<Person>("일반인 과정	 ",5));
		registerCourse(new Course<Worker>("직장인 과정	 ",5));
		registerCourse(new Course<Student>("학생 과정	 ",5));
		registerCourse(new Course<HighStudent>("고등학생 과정",5));
		System.out.println("*****			registerCourse에 모든 객체 대입 가능		*****");
		
		//registerCourseStudent(new Course<Person>("일반인 과정  ",5));
		//registerCourseStudent(new Course<Worker>("직장인 과정  ",5));
		registerCourseStudent(new Course<Student>("학생 과정	 ",5));
		registerCourseStudent(new Course<HighStudent>("고등학생 과정",5));
		System.out.println("***** registerCourseStudent에는 Person객체와 Worker객체는 대입 불가	*****");
		
		registerCourseWorker(new Course<Person>("일반인 과정  ",5));
		registerCourseWorker(new Course<Worker>("직장인 과정  ",5));
		//registerCourseWorker(new Course<Student>("학생 과정	 ",5));
		//registerCourseWorker(new Course<HighStudent>("고등학생 과정",5));
		System.out.println("***** registerCourseStudent에는 Person객체와 Worker객체만 대입 가능	*****");
		
		
		
		Course<Person> personCourse = new Course("일반인 과정", 5); //크기가 5이며, "일반인과정"이라는 이름을 갖고, <Person>타입의 객체로 이뤄진 배열을 갖는 Course객체를 생성
			personCourse.add(new Person("일반인1"));
			personCourse.add(new Person("직장인1"));
			personCourse.add(new Person("학생1"));
			personCourse.add(new Person("고등학생1"));
			
		Course<Worker> workerCourse = new Course("직장인 과정", 5);
			workerCourse.add(new Worker("직장인2"));
			
		Course<Student> studentCourse = new Course("학생 과정", 5);
			studentCourse.add(new Student("학생2"));
			studentCourse.add(new Student("고등학생2"));

		Course<HighStudent> highStudentCourse = new Course("고등학생 과정", 5);
			highStudentCourse.add(new HighStudent("고등학생3"));	
		
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