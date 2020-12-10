package sec04_exam01_multiCatch;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);	
			//예최처리를 다중으로 할 때는, 반드시 상위 예외 클래스처리를 더 아래에서 해야 한다.
			//하위 예외 클래스는 상위 예외클래스를 상속하므로, 상위 예외 처리 코드가 위에 있을 시, 위 처리코드에 걸려버리기 때문이다.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch(Exception e) {
			System.out.println("다른 예외가 발생했습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
