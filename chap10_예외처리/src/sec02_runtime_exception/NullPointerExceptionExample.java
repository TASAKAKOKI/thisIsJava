package sec02_runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
		//NullPointerException이 발생한다.
		//참조하고 있는 객체가 없으므로(Null)...
	}
}