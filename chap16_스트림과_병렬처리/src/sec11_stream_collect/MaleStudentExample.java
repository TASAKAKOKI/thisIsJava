package sec11_stream_collect;

import java.util.Arrays;
import java.util.List;

/*��������������̳ʿ� �����ϱ�
 * 	: List,Set,Map�� �����ϴ� ���� �ƴ϶�, ����� ���� �����̳ʿ� ������Ű�� ���� ���Ѵ�.
 * �������̽�		::����Ÿ��	::	�޼ҵ�(�Ű�����)
 * Stream		::	R  	::collect(Supplier<R>,BiConsumer<R,? super T>,BiConsumer<R,R>)
 * IntStrem		::	R	::collect(Supplier<R>,ObjIntConsumer<R>,BiConsumer<R,R>)
 * LongStream	::	R	::collect(Supplier<R>,ObjLongConsumer<R>,BiConsumer<R,R>)
 * DoubleStream	::	R	::collect(Supplier<R>,ObjDoubleConsumer<R>,BiConsumer<R,R>)
 * 		Consumer�� �ϴ� ����: ��ü�� ��������������̳ʿ� �����ϴ� ����
 * 		BiConsumer�� �ϴ� ����: ����ó���� ����	
 *
 *�Ű�����:
 *	ù��° Supplier: ��ҵ��� ������ �����̳� ��ü�� �����ϴ� ����(��������������̳ʻ���)
 *		����ó��(�̱� ������)��Ʈ��: �� �� �� Supplier�� �����
 *		����ó��(��Ƽ ������)��Ʈ��: �����庰�� Supplier�� ����Ǿ� �����庰�� �����̳ʰ� ������
 *	�ι�° XXXConsumer: �����̳� ��ü�� ��Ҹ� �����ϴ� ����
 *		��Ʈ������ ��Ҹ� �����̳ʿ� ������ ������ ����
 *	����° BiConsumer: �����̳� ��ü�� �����ϴ� ����
 *		����ó��(�̱� ������)��Ʈ��:������ ����
 *		����ó��(��Ƽ ������)��Ʈ��:�����庰�� ������ ��������������̳ʸ� �����ؼ� ���� �����̳ʸ� �ϼ��Ѵ�.
 */	
public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("���̼�", 6, Student.Sex.FEMALE),
				new Student("���ڹ�", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.stream()
										   .filter(s->s.getSex()==Student.Sex.MALE)
										   .collect(
													()->new MaleStudent(),//��������������̳� �����ϴ� ���ٽ�(Supplier�� �Լ����������̽��̴�)
													(r,t)->r.accumulate(t),//BiConsumer�� ���ٽ����μ�, �Ű��� �ΰ��� �̿��Ͽ�, ù��° r�� ����� ���� �����̳��̰�, t�� ���͸��� ��Ұ� �ϳ��� ���Եȴ�.(accumulator)
													(r1,r2)->r1.combine(r2)//r1�� r2�� ���� �ٸ� ��ü, ����ó���������� �����̳� �ΰ��� �Ű������� �޾Ƽ�, �ϳ��� �����̳ʷ� �������ִ� ����(combiner)//�̱۽�����ȯ�濡���� ������� �ʴ´�.
												   );
		maleStudent.getList().stream()
				   .forEach(s->System.out.println(s.getName()));
	}
}