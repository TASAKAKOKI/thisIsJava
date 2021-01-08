package verify;

import java.util.Arrays;
import java.util.List;
/* List에 저장되어 있는 Member 요소의 평균 나이를 출력하시오.
 */
public class exam06 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동",30),
			new Member("신용권",40),
			new Member("김자바",26)
		);
		
		double avg = list.stream()//Member객체들을 요소로 하는 스트림 생성
			//코드작성
			.mapToInt(m->m.getAge()) //Member요소들을 int타입 요소로로 변환
			//.mapToInt(Member::getAge)와 같이 메소드 참조식을 매개값으로 주어도 무방하다.
			.average()
			.getAsDouble();
		
		System.out.println("평균 나이: " + avg);
	}
}

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
}