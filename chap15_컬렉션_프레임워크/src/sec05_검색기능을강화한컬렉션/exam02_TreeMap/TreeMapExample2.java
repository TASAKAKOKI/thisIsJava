package sec05_�˻��������ȭ���÷���.exam02_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
/*TreeMap�� �̿��� ����*/
public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(87, "ȫ�浿");
		treeMap.put(98, "�̵���");
		treeMap.put(80, "���ڹ�");
		treeMap.put(100, "������");
		treeMap.put(95, "�ſ��");
		treeMap.put(75, "�ڱ��");
		
		System.out.println("[�������� ����]");
		NavigableMap<Integer,String> descendingMap = treeMap.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + " Done:)");
		}
		
		System.out.println();
		System.out.println("[�ø����� ����]");
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : ascendingEntrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + " Done:)");
		}

	}
}