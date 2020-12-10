package sec04_exam01_multiCatch;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
			System.out.println("");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}