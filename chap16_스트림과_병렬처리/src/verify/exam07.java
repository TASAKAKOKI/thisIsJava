package verify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List에 저장되어 있는 Member 요소에서 직업이 "개발자"인 사람만 별도로 List로 생성하시오.
public class exam07 {
	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(
			new Member1("홍길동", "개발자"),
			new Member1("김두한", "디자이너"),
			new Member1("김자바", "개발자"),
			new Member1("파이순", "미용사")
		);
		
		List<Member1> developers = list.stream()
			//코드작성
			.filter(m->m.getJob()=="개발자") //job필드가 "개발자인 요소들만 필터링
			//.filter(m->m.getJob().equals("개발자")와 같이 작성하여도 무방
			.collect(Collectors.toList()); //필터링된 요소들을 최종저리로서 수집하여, 새로운 List를 반환
		
		developers.stream().forEach(m->System.out.println(m.getName()));
	}
}

class Member1 {
	private String name;
	private String job;
	
	public Member1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() {return name;}
	public String getJob() {return job;}
}