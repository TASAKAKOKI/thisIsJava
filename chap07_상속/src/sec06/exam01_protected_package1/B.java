package sec06.exam01_protected_package1;

public class B {
	public void method() {
		//A클래스와 같은 패키지 안에 있는 B클래스에서는
		//A클래스에서 protected로 접근 제한을 설정한 필드, 메소드는 접근할 수 있다.
		A a = new A();
		a.field = "value";
		a.method();
	}
}