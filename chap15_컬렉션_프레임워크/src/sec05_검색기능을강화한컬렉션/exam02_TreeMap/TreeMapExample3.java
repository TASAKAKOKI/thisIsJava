package sec05_검색기능을강화한컬렉션.exam02_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/*TreeSet을 이용한 범위검색*/
public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple",10);
		treeMap.put("foever",60);
		treeMap.put("description",40);
		treeMap.put("ever",50);
		treeMap.put("zoo",10);
		treeMap.put("base",20);
		treeMap.put("guess",70);
		treeMap.put("cherry",30);
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableMap<String, Integer> subSet = treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : subSet.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
	}
}