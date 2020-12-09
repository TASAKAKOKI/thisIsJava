package sec03.exam01_handleException;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("변수에 값이 성공적으로 대입되었습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다: 2개의 매개변수 필요");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		System.out.println();
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없는 값이 Integer.parseInt()의 매개값으로 주어졌습니다.");
			System.out.println("data1: " + data1);
			System.out.println("data2: " + data2);
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}