package sec07_String클래스.exam02_method;

/*알파벳 소문자/대문자 변경(toLowerCase(), toUpperCase())
 * 	한글은 해당x, 문자열의 모든 문자를 소문자/대문자로 변경하여 새로운 문자열 리턴
 */
public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		String str3 = "java programming";
		//java언어는 소문자와 대문자를 서로 다른 것으로 본다.
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		
		String lowerStr1 = str1.toLowerCase();
		String upperStr1 = str1.toUpperCase();
		System.out.println("upperStr1.equals(str2): " + upperStr1.equals(str2));
		System.out.println("lowerStr1.equals(str3): " + lowerStr1.equals(str3));
	}
}