package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		//자식 클래스의 생성자에서는 가장 먼저 부모 클래스의 생성자(super(매개값...))를 매개변수타입과 매개변수 순서등에 맞춰 호출해야 한다.
		super(name, ssn);
		// TODO Auto-generated constructor stub
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
