package sec11_stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		/*Collector�� Ÿ�� �Ķ����
		 * ����Ÿ��: R
		 * �޼ҵ�(�Ű�����): collector(Collector<T,A,R> collector)
		 * �������̽�: Stream
		 * 		T: ���
		 * 		A: ������(accumulator)
		 * 		R: ��Ұ� ����� ���ο� �÷���
		 * 		T��Ҹ� A�����Ⱑ R�� ����
		 *Collector�� ���� ��ü
		 *	Collectorsũ������ �����޼ҵ带 �̿�
		 *		����Ÿ�� :: �޼ҵ�
		 *		Collector<T,?,Collection<T>> :: Collectors.toCollection(Supplier<T>)
		 *		Collector<T,? ConcourrentMap<K,V>> :: Collectors.toConcurrentMap(...)
		 *		Collector<T,?,List<T>		 :: Collectors.toList()
		 *		Collector<T,?,Map<K,V>>		 :: Collectors.toMap(...)
		 *		Collector<T,?,Set<T>>		 :: Collectors.toSet()	
		 *A(������)�� ?�� ����:
		 *		List,Map,Set �÷��ǿ� ������ �ܿ쿡�� ������ A(������)�� �ʿ� ����.
		 */
		
		/*��ü �л� List���� ���л��鸸 ������ List�� ������ ���
		List<Student> maleList = totalList.stream().
										  .filter(s->s.getSex()==Student.Sex.MALE)
										  .collect(Collectors.toList());
		*/
		/*��ü �л� List���� ���л��鸸 ������ HashSet���� ������ ���
		Set<Student> femaleSet = totalList.stream()
										  .filter(s->s.getSex()==Student.Sex.FEMALE)
										  .collect(Collectors.toCollection(HashSet::new));
										  //Supplier��� �ϴ� �͸�����ü�� �޼ҵ� ������ ���
										  //��, HashSet�̶�� �ϴ� ��ü�� Supplier�� ������ ��.
										  //����, �� �ڸ��� .toCollection��� toSet�� �ᵵ �ȴ�.
		*/
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("���̼�", 6, Student.Sex.FEMALE),
				new Student("���ڹ�", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE)
		);
		//���л��鸸 ���� List�� �����ϱ�
		List<Student> maleList = totalList.stream() //List���� �������� ��Ʈ������
										  .filter(s->s.getSex()==Student.Sex.MALE)//���л����� ���͸�
										  .collect(Collectors.toList());//���л���θ� ���� ���ο� List����
		maleList.stream()
				.forEach(s->System.out.println(s.getName()));
		System.out.println();
		
		//���л���θ� ���� HashSet �����ϱ�
		Set<Student> femaleSet = totalList.stream()
										  .filter(s->s.getSex()==Student.Sex.FEMALE)
										  .collect(Collectors.toCollection(HashSet::new));//���л��鸸 ���� HashSet���� ��ȯ
		femaleSet.stream()
				 .forEach(s->System.out.println(s.getName()));
	}
}