package sec07_String클래스.exam02_method;
/*
 *문자열 길이(length())
 *	문자열의 길이를 리턴
 */
public class StringLengthExample {
	public static void main(String[] args) {
		String ssn1 = "7645321245326";
		String ssn2 = "76452421365687";
		testNumber(ssn1);
		testNumber(ssn2);
	}
	public static void testNumber(String str){
		System.out.println("주민번호 자리수: " + str.length());
		int length = str.length(); //문자열의 길이(int)를 반환

		if(length==13) {
			System.out.println("주민번호의 자리수가 13개가 맞습니다.");
		} else {
			System.out.println("주민번호의 자리수가 13개가 아닙니다.");
		}
	}
}