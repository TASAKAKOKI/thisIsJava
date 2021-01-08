package sec10_정규표현식과Pattern클래스;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp1 = "(02|010)-\\d{3,4}-\\d{4}";
		
		String data = "010-123-4567"; //true
		testMatching(regExp1,data);
		data = "011-123-4567"; //false
		testMatching(regExp1,data);
		data = "010-1234-4567"; //true
		testMatching(regExp1,data);
		data = "02-123-456"; //false
		testMatching(regExp1,data);
		System.out.println();
		
		String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		String data2 = "example@naver.com"; //true
		testMatching(regExp2,data2);
		data2 = "@false.com"; //false
		testMatching(regExp2,data2);
		data2 = "testing@google.kr.com"; //true
		testMatching(regExp2,data2);
		data2 = "false@naver"; //false
		testMatching(regExp2,data2);
		
	}
	public static void testMatching(String regExp, String testingData) {
		boolean result = Pattern.matches(regExp, testingData);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}