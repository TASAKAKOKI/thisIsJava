package sec04_Map�÷���.exam01_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("�ſ��", 85);//�ߺ��� Ű ��
		map.put("ȫ�浿", 95);
		map.put("�ſ��", 90);//�ߺ��� Ű ���� �����Ƿ�, �ϳ��� ����ȴ�.
		map.put("���ڹ�", 85);
		map.put("koki", 100);
		System.out.println("�� Entry ��: " + map.size());
		System.out.println("\t�ſ��: " + map.get("�ſ��")); //�ߺ��� Ű�� ������ entry�� put�ϴ� ���, ���� �������� entry��ü�� �����Ѵ�.
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();

		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();

		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}
}