package sec06.exam01_protected_package2;

//A클래스가 있는 패키지와는 다른 패키지 이므로,
//A클래스가 있는 패키지를 import해주어야 한다.
import sec06.exam01_protected_package1.*;

public class C {
	public void method() {
		//A클래스와 다른 패키지 안에 있는 C클래스에서는
		//A클래스에서 protected로 접근 제한을 설정한 필드, 메소드는 접근할 수 없다.
		A a = new A(); //(생성자 호출 불가)
		a.field = "value"; //(필드 접근 불가)
		a.method(); //(메소드 호출 불가)
	}
}