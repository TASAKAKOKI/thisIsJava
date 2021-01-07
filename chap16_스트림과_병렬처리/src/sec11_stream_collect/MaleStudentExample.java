package sec11_stream_collect;

import java.util.Arrays;
import java.util.List;

/*사용자정의컨테이너에 수집하기
 * 	: List,Set,Map에 수집하는 것이 아니라, 사용자 정의 컨테이너에 수집시키는 것을 말한다.
 * 인터페이스		::리턴타입	::	메소드(매개변수)
 * Stream		::	R  	::collect(Supplier<R>,BiConsumer<R,? super T>,BiConsumer<R,R>)
 * IntStrem		::	R	::collect(Supplier<R>,ObjIntConsumer<R>,BiConsumer<R,R>)
 * LongStream	::	R	::collect(Supplier<R>,ObjLongConsumer<R>,BiConsumer<R,R>)
 * DoubleStream	::	R	::collect(Supplier<R>,ObjDoubleConsumer<R>,BiConsumer<R,R>)
 * 		Consumer가 하는 역할: 객체를 사용자정의컨테이너에 수집하는 역할
 * 		BiConsumer가 하는 역할: 병렬처리와 관련	
 *
 *매개변수:
 *	첫번째 Supplier: 요소들이 수집될 컨테이너 객체를 생성하는 역할(사용자정의컨테이너생성)
 *		순차처리(싱글 스레드)스트림: 단 한 번 Supplier가 실행됨
 *		병렬처리(멀티 스레드)스트림: 스레드별로 Supplier가 실행되어 스레드별로 컨테이너가 생성됨
 *	두번째 XXXConsumer: 컨테이너 객체에 요소를 수집하는 역할
 *		스트림에서 요소를 컨테이너에 누적할 때마다 실행
 *	세번째 BiConsumer: 컨테이너 객체를 결합하는 역할
 *		순차처리(싱글 스레드)스트림:사용되지 않음
 *		병렬처리(멀티 스레드)스트림:스레드별로 생성된 사용자정의컨테이너를 결합해서 최종 컨테이너를 완성한다.
 */	
public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("파이순", 6, Student.Sex.FEMALE),
				new Student("김자바", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
										   .filter(s->s.getSex()==Student.Sex.MALE)
										   .collect(
													()->new MaleStudent(),//사용자정의컨테이너 생성하는 람다식(Supplier는 함수적인터페이스이다)
													(r,t)->r.accumulate(t),//BiConsumer의 람다식으로서, 매개값 두개를 이용하여, 첫번째 r은 사용자 정의 컨테이너이고, t는 필터링된 요소가 하나씩 대입된다.(accumulator)
													(r1,r2)->r1.combine(r2)//r1과 r2는 서로 다른 객체, 병렬처리과정에서 컨테이너 두개를 매개값으로 받아서, 하나의 컨테이너로 결합해주는 역할(combiner)//싱글스레드환경에서는 실행되지 않는다.
												   );
		maleStudent.getList().stream()
				   .forEach(s->System.out.println(s.getName()));
	}
}