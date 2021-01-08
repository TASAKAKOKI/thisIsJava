package verify;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//List에 저장되어 있는 Member요소를 직업별로 그룹핑해서 Map<String, List<String>>객체로 생성하려고 한다. 
//키는 Member의 직업이고, 값은 Member의 이름으로 구성된 List<String>이 되도록 코드를 작성하시오.
/*결과물: [개발자] 홍길동 김자바
		[디자이너] 김두한
		[미용사] 파이순 방그레
		[건축가] 박나미
*/
public class exam08 {
	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(
			new Member1("홍길동", "개발자"),
			new Member1("김두한", "디자이너"),
			new Member1("김자바", "개발자"),
			new Member1("파이순", "미용사"),
			new Member1("박나미", "건축가"),
			new Member1("방그레", "미용사")
		);
		
		Map<String,List<String>> groupingMap = list.stream()
			//코드작성
			.collect(Collectors.groupingBy( //collect()메소드 호출 // Collectors.groupingBy()를 매개값으로 전달
						Member1::getJob,	//Member에서 Job을 얻어 키로 사용할 것임을 명시
						Collectors.mapping( //값으로 저장될 것이 멤버객체가 아니라, 멤버의 이름이므로, 이를 매핑해주어야 함.
								Member1::getName, 
								Collectors.toList())
						)
					);
		
		Set<String> keySet = groupingMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.print("[" + key + "] ");
			groupingMap.get(key).stream().forEach(m->System.out.print(m + " "));
			System.out.print("\n");
		}
	}
}