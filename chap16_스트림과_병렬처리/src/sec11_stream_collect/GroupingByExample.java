package sec11_stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		/*학생의 성을 키(Key)로 해서 남학생List와 여학생List가 저장된 Map얻기
		 *groupingBy(Function<T,K> classifier)를 사용
		 *		Map<Student.Sex,List<Student>> mapBySex = totalList.stream().collect(Collectors.groupingBy(Student::getSex)); //매개값으로 Function함수적인터페이스의 익명구현객체가 옴 즉, 그 객체의 반환값이 키가 됨
		 */
		
		
		/*학생의 주거도시를 키(Key)로 해서 학생의 이름List가 저장된 Map얻기
		 *groupingBy(Function<T,K> classifier, Collector<T,A,D>downstream)을 사용
		 *		Map<Student.City,List<Student>> mapByCity = totalList.stream().collect( Collectors.groupingBy( Student::getCity, Collectors.mapping(Student::getName,Collectors.toList()) ) );
		 */
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE,Student.City.Seoul),
				new Student("파이순", 6, Student.Sex.FEMALE,Student.City.Pusan),
				new Student("김자바", 10, Student.Sex.MALE,Student.City.Pusan),
				new Student("박수미", 6, Student.Sex.FEMALE,Student.City.Seoul)
		);
		
		Map<Student.Sex,List<Student>> mapBySex = totalList.stream()
														.collect(Collectors.groupingBy(Student::getSex));
		System.out.print("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream()
				.forEach(s->System.out.print(s.getName() + " "));
		
		System.out.print("\n[여학생] ");
		mapBySex.get(Student.Sex.FEMALE).stream()
				.forEach(s->System.out.print(s.getName() + " "));
		System.out.println();
		
		Map<Student.City,List<String>> mapByCity = totalList.stream()
			.collect(
					Collectors.groupingBy(
							Student::getCity,
							Collectors.mapping(
									Student::getName,
									Collectors.toList()
							)
					)
			);
		System.out.print("\n[서울] ");
		mapByCity.get(Student.City.Seoul).stream()
					.forEach(s->System.out.print(s + " "));
		
		System.out.print("\n[부산] ");
		mapByCity.get(Student.City.Pusan).stream()
					.forEach(s->System.out.print(s + " "));
	}
}