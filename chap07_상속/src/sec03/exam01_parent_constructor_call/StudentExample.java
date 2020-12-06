package sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String args[]) {
		Student student1 = new Student("±èÀÚ¹Ù", "123456-1234567",1);
		System.out.println("name: " + student1.name);
		System.out.println("ssn: " + student1.ssn);
		System.out.println("studentNo: " + student1.studentNo);
	}
}
