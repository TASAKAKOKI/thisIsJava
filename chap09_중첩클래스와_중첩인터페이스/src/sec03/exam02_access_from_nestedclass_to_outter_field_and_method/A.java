package sec03.exam02_access_from_nestedclass_to_outter_field_and_method;

public class A {
	//인스턴트 필드 및 메소드
	int field1;
	void method1() {}
	
	//정적 필드 및 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			/*인스턴스 멤버 클래스 내부에서는 외부 클래스의 인스턴스 및 정적 필드/메소드 모두에 접근할 수 있다.*/
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
			/*정적 멤버 클래스 내부에서는 외부 클래스의 정적 필드 및 정적 메소드에만 접근할 수 있다.*/
			field1 = 10; 	//(x)
			method1();		//(x)
			
			field2 = 10;
			method2();
		}
	}
}