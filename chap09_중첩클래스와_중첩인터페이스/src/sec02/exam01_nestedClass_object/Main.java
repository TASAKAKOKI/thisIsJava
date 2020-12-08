package sec02.exam01_nestedClass_object;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		//인스턴스 멤버 클래스 객체 생성
		/*인스턴스 멤버 클래스의 생성을 위해서는, 반드시 A객체의 생성이 우선되어야 한다.*/
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		/*정적 멤버 클래스의 생성에는 A객체의 생성이 필요없다.
		클래스 접근을 통해서 정적 멤버 클래스 객체를 생성할 수 있고,
		정적 필드, 정적 메소드를 사용 및 호출 할 수 있다.*/
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; //정적 필드 접근
		A.C.method2(); //정적 메소드 호출
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();		
	}
}