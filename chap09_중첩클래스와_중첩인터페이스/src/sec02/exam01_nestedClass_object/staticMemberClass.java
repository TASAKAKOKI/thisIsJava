package sec02.exam01_nestedClass_object;

public class staticMemberClass {
	/*정적 멤버 클래스*/
	/*모든 종류의 필드, 메소드를 선언할 수 있다.*/
	static class C {
		C() {} 					// 생성자
		int field1; 			//인스턴스 필드
		static int field2; 		//정적 필드
		void method1() {} 		//인스턴스 메소드
		static void method2() {} //정적 메소드
	}
}