package verify;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//List�� ����Ǿ� �ִ� Member��Ҹ� �������� �׷����ؼ� Map<String, List<String>>��ü�� �����Ϸ��� �Ѵ�. 
//Ű�� Member�� �����̰�, ���� Member�� �̸����� ������ List<String>�� �ǵ��� �ڵ带 �ۼ��Ͻÿ�.
/*�����: [������] ȫ�浿 ���ڹ�
		[�����̳�] �����
		[�̿��] ���̼� ��׷�
		[���డ] �ڳ���
*/
public class exam08 {
	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(
			new Member1("ȫ�浿", "������"),
			new Member1("�����", "�����̳�"),
			new Member1("���ڹ�", "������"),
			new Member1("���̼�", "�̿��"),
			new Member1("�ڳ���", "���డ"),
			new Member1("��׷�", "�̿��")
		);
		
		Map<String,List<String>> groupingMap = list.stream()
			//�ڵ��ۼ�
			.collect(Collectors.groupingBy( //collect()�޼ҵ� ȣ�� // Collectors.groupingBy()�� �Ű������� ����
						Member1::getJob,	//Member���� Job�� ��� Ű�� ����� ������ ���
						Collectors.mapping( //������ ����� ���� �����ü�� �ƴ϶�, ����� �̸��̹Ƿ�, �̸� �������־�� ��.
								Member1::getName, 
								Collectors.toList())
						)
					);
		
		Set<String> keySet = groupingMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.print("[" + key + "] ");
			groupingMap.get(key).stream().forEach(m->System.out.print(m + " "));
			System.out.print("\n");
		}
	}
}