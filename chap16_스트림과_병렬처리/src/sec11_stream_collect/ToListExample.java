package sec11_stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		/*Collector의 타입 파라미터
		 * 리턴타입: R
		 * 메소드(매개변수): collector(Collector<T,A,R> collector)
		 * 인터페이스: Stream
		 * 		T: 요소
		 * 		A: 누적기(accumulator)
		 * 		R: 요소가 저장될 새로운 컬렉션
		 * 		T요소를 A누적기가 R에 저장
		 *Collector의 구현 객체
		 *	Collectors크래스의 정적메소드를 이용
		 *		리턴타입 :: 메소드
		 *		Collector<T,?,Collection<T>> :: Collectors.toCollection(Supplier<T>)
		 *		Collector<T,? ConcourrentMap<K,V>> :: Collectors.toConcurrentMap(...)
		 *		Collector<T,?,List<T>		 :: Collectors.toList()
		 *		Collector<T,?,Map<K,V>>		 :: Collectors.toMap(...)
		 *		Collector<T,?,Set<T>>		 :: Collectors.toSet()	
		 *A(누적기)가 ?인 이유:
		 *		List,Map,Set 컬렉션에 누적할 겨우에는 별도의 A(누적기)가 필요 없다.
		 */
		
		/*전체 학생 List에서 남학생들만 별도의 List로 생성할 경우
		List<Student> maleList = totalList.stream().
										  .filter(s->s.getSex()==Student.Sex.MALE)
										  .collect(Collectors.toList());
		*/
		/*전체 학생 List에서 여학생들만 별도의 HashSet으로 생성할 경우
		Set<Student> femaleSet = totalList.stream()
										  .filter(s->s.getSex()==Student.Sex.FEMALE)
										  .collect(Collectors.toCollection(HashSet::new));
										  //Supplier라고 하는 익명구현객체로 메소드 참조를 사용
										  //즉, HashSet이라고 하는 객체를 Supplier가 생성한 것.
										  //물론, 이 자리에 .toCollection대신 toSet을 써도 된다.
		*/
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("파이순", 6, Student.Sex.FEMALE),
				new Student("김자바", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
		);
		//남학생들만 묶어 List로 생성하기
		List<Student> maleList = totalList.stream() //List에서 오리지널 스트림생성
										  .filter(s->s.getSex()==Student.Sex.MALE)//남학생들을 필터링
										  .collect(Collectors.toList());//남학생들로만 묶어 새로운 List생성
		maleList.stream()
				.forEach(s->System.out.println(s.getName()));
		System.out.println();
		
		//여학생들로만 묶어 HashSet 생성하기
		Set<Student> femaleSet = totalList.stream()
										  .filter(s->s.getSex()==Student.Sex.FEMALE)
										  .collect(Collectors.toCollection(HashSet::new));//여학생들만 묶어 HashSet으로 반환
		femaleSet.stream()
				 .forEach(s->System.out.println(s.getName()));
	}
}