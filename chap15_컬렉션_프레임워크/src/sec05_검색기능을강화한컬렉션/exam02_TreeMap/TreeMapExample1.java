package sec05_검색기능을강화한컬렉션.exam02_TreeMap;

import java.util.Map;
import java.util.TreeMap;
/*TreeMap을 이용하여 단일 객체 찾기*/
public class TreeMapExample1 {
	public static void main(String[] args) {
		//TreeMap은 이진트리(BinaryTree)를 기반으로 한 Map컬렉션
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		/*TreeSet의 주요 메소드에는
		 *단일 노드 객체를 찾는 메소드: firstEntry(), lastEntry(), lowerEntry(), higherEntry()
		 *정렬 메소드: descendingKeySet(), descendingMap()
		 *범위 검색 메소드: headMap(), tailMap(), subMap()
		 *등이 있다.
		*/
		
		treeMap.put(87, "홍길동");
		treeMap.put(98, "이동수");
		treeMap.put(80, "김자바");
		treeMap.put(100, "정강수");
		treeMap.put(95, "신용권");
		treeMap.put(75, "박길순");
		
		Map.Entry<Integer,String> entry = null;
		
		entry = treeMap.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + " - " + entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println();
		entry = treeMap.lowerEntry(95);
		System.out.println("95보다 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.higherEntry(95);
		System.out.println("95보다 높은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		System.out.println();
		entry = treeMap.floorEntry(95);
		System.out.println("95와 같거나 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.ceilingEntry(97);
		System.out.println("97와 같거나 높은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		System.out.println();
		/*높은 순서대로 poll 하기*/
		while(!treeMap.isEmpty()) {
			entry = treeMap.pollLastEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "(남은 객세 수: " + treeMap.size() + ")");
		}
		/*낮은 순서대로 poll하기
		System.out.println();
		while(!treeMap.isEmpty()) {
			entry = treeMap.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "(남은 객세 수: " + treeMap.size() + ")");
		}
		*/
		
		
	}
}