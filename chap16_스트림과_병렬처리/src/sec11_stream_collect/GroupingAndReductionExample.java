package sec11_stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Collectors.groupingByXXX()메소드에서
 * Function함수적인터페이스 구현객체가 하는 역할은,
 * 		T요소를 어떤K(키)에 저장할지를 정해준다.
 * Collector객체가 하는 역할은
 * 		요소를 그룹핑할 때, 요소를 매핑을 하고, 집계를 한다.
 */

/*Collectors.groupingBy()메소드는 그룹핑 후,
 * 매핑이나 집계(평균, 카운팅, 연결, 최대, 최소, 합계)을 할 수 있도록 하기 위해
 * 두번째 매개값으로 Collector를 가질 수 있다.
 *Collector객체를 생성하는 여러가지 메소드 
 * 		Collectors.mapping(Function, Collector)
 * 			//어떤 함수로 매핑할 것인가, 어떤 컬렉션에 저장할 것인가
 * 		Collectors.averageingDouble(ToDoubleFunction)
 * 			//그룹핑 이후, 평균값 저장
 *		Collectors.counting()
 *			//요소의 수를 카운팅
 *		Collectors.joining(...)
 *			//문자 요소들을 연결
 *		Collectors.maxBy(Comparator)
 * 		Collectors.minBy(Comparator)
 * 			//Comparator를 이용하여 최대값, 최소값을 저장
 *		Collectors.reducing(...)
 *			//커스텀(사용자정의)리덕션 값을 저장
 *		Collectors.summarizingXXX(ToXXXFunction)
 *이 있다.
 */
public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE),
				new Student("파이순",12,Student.Sex.FEMALE),
				new Student("김자바",10,Student.Sex.MALE),
				new Student("박수미",12,Student.Sex.FEMALE)
		);
		
		//성(sex)을 키로, 남/여 평균점수를 값으로 갖는 Map얻기
		Map<Student.Sex,Double> mapBySex = totalList.stream()
				.collect(
					   Collectors.groupingBy(
							   Student::getSex,
							   Collectors.averagingDouble(Student::getScore)
					   )
			   );
		System.out.println("남학생 평균 점수: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(Student.Sex.FEMALE));
		
		//성(sex)을 키로, 쉼표로 구분된 학생 이름 문자열을 값으로 갖는 Map얻기
		Map<Student.Sex,String> mapByName = totalList.stream()
				.collect(
					Collectors.groupingBy(
							Student::getSex,
							Collectors.mapping(
								Student::getName,
								Collectors.joining(",")
							)
					)
				);
		System.out.println("남학생 이름: " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 이름: " + mapByName.get(Student.Sex.FEMALE));
	}
}