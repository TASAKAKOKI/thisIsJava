package verify.exam04;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			//x *= 10; // 람다식에서 외부로컬변수를 사용할 경우에, 그 로컬 변수는 암시적으로 final 특성을 갖게 되므로, 값을 변경할 수 없다.
			int result = ( x + y ) * 10;
			return result;
		};
		int result = supplier.getAsInt();
		return result;		
	}
	
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}
}