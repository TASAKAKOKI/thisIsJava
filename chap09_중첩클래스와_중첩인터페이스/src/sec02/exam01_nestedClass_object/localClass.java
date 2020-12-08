package sec02.exam01_nestedClass_object;

public class localClass {
	/*로컬 클래스*/
	/*접근제한자(public,default) 및 static을 붙일 수 없다.*/
	/*메소드 내부에서만 사용가능하며, 인스턴스 필드와 인스턴스 메소드만 선언 가능*/
	void method() {
		class D {
			D() {} 					// 생성자
			int field1; 			//인스턴스 필드
			//static int field2; 		//정적 필드
			void method1() {} 		//인스턴스 메소드
			//static void method2() {} //정적 메소드
		}
		/*로컬 클래스는 메소드 안에서만 사용된다.
		따라서 바깥 클래스 객체 성성, 클래스를 통한 접근 등이 필요없고, 접근제한자도 필요없다.*/
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}