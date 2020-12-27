package sec03_타겟타입과_함수적인터페이스.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi;
		mfi = () -> {
			System.out.println("MyFunctionalInterface 구현 객체의 method() 실행");
		};
		mfi.method();
		
		//아래의 두 작성법은 동일하다.
		//즉, 실행문이 하나일 경우 {} 생략 가능
		mfi = () -> { System.out.println("method call2"); };
		mfi.method();
		mfi = () -> System.out.println("method call3");
		mfi.method();
		
		//람다식 사용하지 않고, 익명 구현 객체를 생성하여 메소드 호출하기
		mfi = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("method call4");
			}
		};
		mfi.method();
	}
}