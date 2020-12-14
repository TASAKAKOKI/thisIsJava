package sec12_Wrapper_포장_클래스.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		/*
		 *객체(object)가 기본타입(int, char 등..)으로 대입이 되거나,
		 *연산이 될 떄는, 객체가 반드시 랩퍼객체가 되어야만 자동으로 unboxing이 이뤄진다.
		*/
		 		
		//대입시 자동 UnBoxing
		//문법적으로는 사실 객체가 기본타입 int로 대입되는 것은 말이 안되지만,
		//자동 언박싱이 이뤄져서 대입이 가능하다.
		int value = obj;
		System.out.println("value: " + value);
		
		//연산시 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}