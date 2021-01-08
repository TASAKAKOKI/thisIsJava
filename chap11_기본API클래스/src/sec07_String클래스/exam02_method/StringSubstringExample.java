package sec07_String클래스.exam02_method;

/* 문자열 잘라내기(substring())
 * 	substring(int beginIndex, intendIndex)
 * 		주어진 시작과 끝 인덱스 사이의 문자열을 추출 (끝 인덱스 포함x)
 * 	substring(int beginIndex)
 * 		주어진 인덱스 이후부터 끝까지 문자열을 추출
 */
public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}