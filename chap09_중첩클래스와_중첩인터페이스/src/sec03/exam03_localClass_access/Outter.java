package sec03.exam03_localClass_access;

public class Outter {
	//자바7버전
	/*java7이전에는 final을 붙여 주어야만 로컬클래스 내부에서 외부 클래스의 매개값이나 로컬변수를 복사하여 사용할 수 있다.
	복사해야 하는 이유는, 외부클래스의 메소드가 종료가 되어도 로컬클래스는 계속해서 힙영역에 남아서 실행되어야 하기때문이다.*/
	public void method1(final int arg) {
		final int localVar = 1;
		/*arg = 1;
		localVar = 10; final로 선언 되었으므로, 초기화 할 수 없다.
		*/
		class Inner {
			void method() {
				int result = arg + localVar;
			}
		}
	}
	//자바8이후
	/*java8부터는 final키워드를 붙여주지 않아도, final특성을 갖게 되어 사용할 수 있다.
	다만, final을 붙인 경우, 내부 클래스의 로컬변수영역에 복사되고,
	final을 붙이지 않은 경우에는, 내부 클래스의 필드영역에 복사가 이뤄진다.*/
	public void method21(int arg) {
		int localVar = 1;
		/*arg = 1;
		localVar = 10; 내부 클래스에서 변수가 사용되었으므로, final특성을 갖게 되어 초기화 할 수 없다.
		*/
		class Inner {
			void method() {
				int result = arg + localVar;
			}
		}
	}
}