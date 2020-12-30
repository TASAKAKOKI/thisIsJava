package sec04_Map컬렉션.exam01_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);//중복된 키 값
		map.put("홍길동", 95);
		map.put("신용권", 90);//중복된 키 값을 가지므로, 하나만 저장된다.
		map.put("김자바", 85);
		map.put("koki", 100);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println("\t신용권: " + map.get("신용권")); //중복된 키를 가지고 entry를 put하는 경우, 가장 마지막의 entry객체만 저장한다.
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();

		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
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
		System.out.println("총 Entry 수: " + map.size());
	}
}