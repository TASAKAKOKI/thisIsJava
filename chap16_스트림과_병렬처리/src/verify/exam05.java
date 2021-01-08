package verify;

import java.util.Arrays;
import java.util.List;

/*List에 저장되어 있는 String요소에서 대소문자와 상관없이 "java"라는 단어가 포함된 문자열만 필터링해서 출력하는 코드를 작성하시오.
 * */
public class exam05 {
	public static void main(String[] arg) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expression",
			"Java8 supports lambdaexpressions"
		);
		
		list.stream()
			//코드작성
			.filter(s->s.toLowerCase().contains("java")) //문자열을 먼저 소문자로 변환한 뒤, java라는 문자열이 포함된 요소만 필터링
			.forEach(System.out::println);
	}
}