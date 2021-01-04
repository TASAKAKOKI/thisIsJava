package sec03_��Ʈ������������;

import java.util.Arrays;
import java.util.List;
//import java.util.OptionalDouble;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		/*�ڵ�� ���� ���� 
		List<Member> list = Arrays.asList();
		Stream<Member> maleFemaleStream = list.stream();
		Stream<Member> maleStream = maleFemaleStream.filter(m -> m.getSex() == Member.MALE);
		IntStream ageStream = maleStream.mapToInt(Member :: getAge);
		OptionalDouble optionalDouble = ageStream.average();
		double ageAvg = optionalDouble.getAsDouble();
		*/
		
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("���̼�", Member.FEMALE, 20),
				new Member("���ڹ�", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 27)
		);
		
		double ageAvg = list.stream()
						.filter(m -> m.getSex()==Member.MALE)
						.mapToInt(Member::getAge)
						.average()
						.getAsDouble();
		System.out.println("���� ȸ������ ������ ��հ�: " + ageAvg);
	}
}