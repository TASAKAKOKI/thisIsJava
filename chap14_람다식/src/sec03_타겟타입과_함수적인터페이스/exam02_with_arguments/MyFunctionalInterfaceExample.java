package sec03_타겟타입과_함수적인터페이스.exam02_with_arguments;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi;
		mfi = (int x) -> {
			System.out.println("method call1 result: " + x*2);
		};
		mfi.method(1);
		
		//아래의 두 작성법은 동일하다.
		//즉, 매개타입은 적지 않아도 되며, 매개값이 하나인 경우 ()생략 가능
		mfi = (x) -> { System.out.println("method call2 result: " + x*2); };
		mfi.method(2);
		mfi = x -> System.out.println("method call3 result: " + x*2);
		mfi.method(3);
		
		//람다식 사용하지 않고, 익명 구현 객체를 생성하여 메소드 호출하기
		mfi = new MyFunctionalInterface() {
			@Override
			public void method(int x) {
				System.out.println("method call4 result: " + x*2);
			}
		};
		mfi.method(4);
	}
}