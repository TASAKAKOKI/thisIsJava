package sec05_검색기능을강화한컬렉션.exam02_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
/*TreeMap을 이용한 정렬*/
public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(87, "홍길동");
		treeMap.put(98, "이동수");
		treeMap.put(80, "김자바");
		treeMap.put(100, "정강수");
		treeMap.put(95, "신용권");
		treeMap.put(75, "박길순");
		
		System.out.println("[내림차순 정렬]");
		NavigableMap<Integer,String> descendingMap = treeMap.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + " Done:)");
		}
		
		System.out.println();
		System.out.println("[올림차순 정렬]");
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : ascendingEntrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + " Done:)");
		}

	}
}