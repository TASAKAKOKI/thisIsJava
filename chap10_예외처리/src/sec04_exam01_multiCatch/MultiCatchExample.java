package sec04_exam01_multiCatch;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);	
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			//java7부터는 multi catch 기능을 지원
			// | 기호를 입력하므로써, or 기능을 구현할 수 있다.
			System.out.println("실행 매개값의 수가 부족하거나, 숫자로 변환할 수 없습니다.");
		}
		/* 아래의 두 줄의 코드를 위의 한 줄로 처리할 수 있다.
		 *catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족하거나, 숫자로 변환할 수 없습니다.");
		} catch(NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나, 숫자로 변환할 수 없습니다.");
		}
		 **/		
		catch(Exception e) {
			System.out.println("다른 예외가 발생했습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}