package sec11_stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Collectors.groupingByXXX()�޼ҵ忡��
 * Function�Լ����������̽� ������ü�� �ϴ� ������,
 * 		T��Ҹ� �K(Ű)�� ���������� �����ش�.
 * Collector��ü�� �ϴ� ������
 * 		��Ҹ� �׷����� ��, ��Ҹ� ������ �ϰ�, ���踦 �Ѵ�.
 */

/*Collectors.groupingBy()�޼ҵ�� �׷��� ��,
 * �����̳� ����(���, ī����, ����, �ִ�, �ּ�, �հ�)�� �� �� �ֵ��� �ϱ� ����
 * �ι�° �Ű������� Collector�� ���� �� �ִ�.
 *Collector��ü�� �����ϴ� �������� �޼ҵ� 
 * 		Collectors.mapping(Function, Collector)
 * 			//� �Լ��� ������ ���ΰ�, � �÷��ǿ� ������ ���ΰ�
 * 		Collectors.averageingDouble(ToDoubleFunction)
 * 			//�׷��� ����, ��հ� ����
 *		Collectors.counting()
 *			//����� ���� ī����
 *		Collectors.joining(...)
 *			//���� ��ҵ��� ����
 *		Collectors.maxBy(Comparator)
 * 		Collectors.minBy(Comparator)
 * 			//Comparator�� �̿��Ͽ� �ִ밪, �ּҰ��� ����
 *		Collectors.reducing(...)
 *			//Ŀ����(���������)������ ���� ����
 *		Collectors.summarizingXXX(ToXXXFunction)
 *�� �ִ�.
 */
public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿",10,Student.Sex.MALE),
				new Student("���̼�",12,Student.Sex.FEMALE),
				new Student("���ڹ�",10,Student.Sex.MALE),
				new Student("�ڼ���",12,Student.Sex.FEMALE)
		);
		
		//��(sex)�� Ű��, ��/�� ��������� ������ ���� Map���
		Map<Student.Sex,Double> mapBySex = totalList.stream()
				.collect(
					   Collectors.groupingBy(
							   Student::getSex,
							   Collectors.averagingDouble(Student::getScore)
					   )
			   );
		System.out.println("���л� ��� ����: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("���л� ��� ����: " + mapBySex.get(Student.Sex.FEMALE));
		
		//��(sex)�� Ű��, ��ǥ�� ���е� �л� �̸� ���ڿ��� ������ ���� Map���
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
		System.out.println("���л� �̸�: " + mapByName.get(Student.Sex.MALE));
		System.out.println("���л� �̸�: " + mapByName.get(Student.Sex.FEMALE));
	}
}