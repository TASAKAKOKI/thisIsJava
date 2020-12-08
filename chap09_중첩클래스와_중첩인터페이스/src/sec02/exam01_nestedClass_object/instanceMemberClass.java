package sec02.exam01_nestedClass_object;

public class instanceMemberClass {
	/*인스턴스 멤버 클래스*/
	/*외부 클래스가 생성되어야만 사용 가능하며, static을 붙일 수 없다.*/
	void method() {
		class B {
			B() {} 					// 생성자
			int field1; 			//인스턴스 필드
			//static int field2; 		//정적 필드
			void method1() {} 		//인스턴스 메소드
			//static void method2() {} //정적 메소드
		}
	}
}