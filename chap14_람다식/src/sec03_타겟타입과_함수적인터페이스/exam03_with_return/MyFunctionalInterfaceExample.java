package sec03_타겟타입과_함수적인터페이스.exam03_with_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi;
		mfi = (int x, int y) -> {
			return x+y;
		};
		int result1 = mfi.method(1,1);
		System.out.println("result1: " + result1);
		
		//매개변수가 2개 이상인 경우에는 ()를 생략할 수 없다.
		//return문 하나만 있는 경우 {}와 return 키워드 모두 생략가능
		mfi = (x,y) -> { return x+y; };
		int result2 = mfi.method(2,2);
		System.out.println("result2: " + result2);
		
		mfi = (x,y) -> x+y;
		int result3 = mfi.method(3,3);
		System.out.println("result3: " + result3);
		
		//리턴값에 함수 이용하기
		mfi = (x,y) -> sum(x,y);
		int result4 = mfi.method(4,4);
		System.out.println("result4: " + result4);
	
		//위의 람다식 표현법들은 모두 아래와 같이 익명구현객체를 생성하는 것과 동일하다.
		mfi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		int result5 = mfi.method(5,5);
		System.out.println("result5: " + result5);
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
}