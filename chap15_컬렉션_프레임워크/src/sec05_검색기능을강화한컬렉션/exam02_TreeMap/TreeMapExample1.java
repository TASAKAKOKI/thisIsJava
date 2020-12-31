package sec05_�˻��������ȭ���÷���.exam02_TreeMap;

import java.util.Map;
import java.util.TreeMap;
/*TreeMap�� �̿��Ͽ� ���� ��ü ã��*/
public class TreeMapExample1 {
	public static void main(String[] args) {
		//TreeMap�� ����Ʈ��(BinaryTree)�� ������� �� Map�÷���
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		/*TreeSet�� �ֿ� �޼ҵ忡��
		 *���� ��� ��ü�� ã�� �޼ҵ�: firstEntry(), lastEntry(), lowerEntry(), higherEntry()
		 *���� �޼ҵ�: descendingKeySet(), descendingMap()
		 *���� �˻� �޼ҵ�: headMap(), tailMap(), subMap()
		 *���� �ִ�.
		*/
		
		treeMap.put(87, "ȫ�浿");
		treeMap.put(98, "�̵���");
		treeMap.put(80, "���ڹ�");
		treeMap.put(100, "������");
		treeMap.put(95, "�ſ��");
		treeMap.put(75, "�ڱ��");
		
		Map.Entry<Integer,String> entry = null;
		
		entry = treeMap.firstEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + " - " + entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println();
		entry = treeMap.lowerEntry(95);
		System.out.println("95���� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.higherEntry(95);
		System.out.println("95���� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		
		System.out.println();
		entry = treeMap.floorEntry(95);
		System.out.println("95�� ���ų� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.ceilingEntry(97);
		System.out.println("97�� ���ų� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		
		System.out.println();
		/*���� ������� poll �ϱ�*/
		while(!treeMap.isEmpty()) {
			entry = treeMap.pollLastEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "(���� ���� ��: " + treeMap.size() + ")");
		}
		/*���� ������� poll�ϱ�
		System.out.println();
		while(!treeMap.isEmpty()) {
			entry = treeMap.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "(���� ���� ��: " + treeMap.size() + ")");
		}
		*/
		
		
	}
}