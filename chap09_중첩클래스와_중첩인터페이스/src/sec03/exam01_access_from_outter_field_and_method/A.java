package sec03.exam01_access_from_outter_field_and_method;

public class A {
	//인스턴스 멤버 클래스
	/*A라는 외부 객체가 생성되어야 객체 생성 가능*/
	class B {}
	
	//정적 멤버 클래스
	/*A라는 외부 객체 생성하지 않아도 생성 및 접근 가능*/
	class C {}
	
	//A클래스의 필드 및 메소드 선언부
	/*1)인스턴스 필드 선언부
	인스턴스 멤버 클래스와 정적 멤버 클래스 모두 생성 가능*/
	B field1 = new B();
	C field2 = new C();
	
	/*2)인스턴스 메소드 선언부
	인스턴스 멤버 클래스와 정적 멤버 클래스 모두 생성 가능*/
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//3)정적 필드의 초기화
	static B field3 = new B(); //컴파일 에러 발생: 중첩클래스인 B 인스턴스 멤버 클래스는 반드시 외부 클래스 A의 객체 생성이 우선 이뤄져야 생성 가능하다.
	static C field4 = new C();
	
	//4)정적 메소드 선언부
	static void method2() {
		B var3 = new B(); //컴파일 에러 발생: 중첩클래스인 B 인스턴스 멤버 클래스는 반드시 외부 클래스 A의 객체 생성이 우선 이뤄져야 생성 가능하다.
		C var4 = new C();
	}
}