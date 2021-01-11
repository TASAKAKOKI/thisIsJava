package sec02_작업스레드_생성과_실행.exam01_createThread;

import java.awt.Toolkit;

public class BeepPrintExampl1 {
	public static void main(String[] args) {
		//비프음을  5번 반복해서 소리나게 하는 작업을 생성
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(600);} catch(Exception e) {}
		}

		//"띵" 문자열을 5번 출력하는 작업을 생성
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
		
		/*위와 같이 작성하면, 메인스레드만 존재하므로,
		 *비프음이 0.6초 간격으로 5번 난 뒤에, 0.6초 간격으로 "띵"이라는 문자열이 출력된다.
		 */
	}
}