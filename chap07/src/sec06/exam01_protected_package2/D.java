package sec06.exam01_protected_package2;

//A클래스가 있는 패키지와는 다른 패키지 이므로,
//A클래스가 있는 패키지를 import해주어야 한다.
import sec06.exam01_protected_package1.*;

public class D extends A {
	public D() {
		//A클래스와 다른 패키지 안에 있는 D클래스는 
		//비록 다른 패키지 안에 있지만, A클래스를 상속하였기 때문에,
		//A클래스에서 protected로 접근 제한을 설정한 필드, 메소드는 접근할 수 있다.
		super(); //(부모 클래스의 생성자 호출)
		this.field = "value"; //(부모 클래스의 필드 접근)
		this.method(); //(부모 클래스의 메소드 호출)
	}
}