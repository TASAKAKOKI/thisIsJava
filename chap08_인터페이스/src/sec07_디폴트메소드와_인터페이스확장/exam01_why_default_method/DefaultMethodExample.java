package sec07_디폴트메소드와_인터페이스확장.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		//기존의 MyClassA는 기존의 인터페이스의 메소드만 사용가능하고,
		//재정의 하지 않았으므로, 만약 새롭게 추가된 디폴트 메소드를 사용한다면,
		//인터페이스에 정의된 메소드 실행블록이 실행된다.
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		//MyClassB는 디폴트 메소드를 재정의하여 사용.
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
