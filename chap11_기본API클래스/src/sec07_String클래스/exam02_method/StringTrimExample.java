package sec07_String클래스.exam02_method;

/*문자열 앞뒤 공백 잘라내기(trim())
 * 	중간의 공백은 잘라내지 않음
 * 		String oldStr = "   자바 프로그래밍   ";
 * 		String newStr = oldStr.trim();
 * 		System.out.println(oldStr + "\n" + newStr);
 */
public class StringTrimExample {
	public static void main(String[] args) {
		String oldStr = "   자바 프로그래밍   ";
		String newStr = oldStr.trim();
		System.out.println(oldStr + "\n" + newStr);

		String tel1 = " 02";
		String tel2 = "-123   ";
		String tel3 = "   -1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
	}
}