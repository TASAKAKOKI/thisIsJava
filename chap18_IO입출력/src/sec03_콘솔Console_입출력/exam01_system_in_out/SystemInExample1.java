package sec03_콘솔Console_입출력.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {
		System.out.println("==메뉴==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요: ");
		
		InputStream is = System.in;
		char selectedNo = (char) is.read();
		switch(selectedNo) {
		case '1':
			System.out.println("예금을 조회합니다.");
			break;
		case '2':
			System.out.println("예금을 출금합니다.");
			break;
		case '3':
			System.out.println("예금을 입금합니다.");
			break;
		case '4':
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못 누르셨습니다.");
		}
	}
}