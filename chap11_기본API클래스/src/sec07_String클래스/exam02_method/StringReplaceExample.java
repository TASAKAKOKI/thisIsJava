package sec07_String클래스.exam02_method;

/*문자열 대치(replace())
 * 	첫번째 매개값(String)을 찾아 두번째 매개값(String)으로 대치한 새로운 문자열을 리턴
 */
public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바를 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "java"); 
		System.out.println(oldStr + "\n" + newStr);
	}
}