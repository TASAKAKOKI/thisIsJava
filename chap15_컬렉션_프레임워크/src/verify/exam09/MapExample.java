package verify.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String id = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		/*코드 작성*/
		//기대결과---
		//평균점수: 91
		//최고점수: 96
		//최고점수를 받은 아이디: blue;
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet(); //Map.Entry얻기
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				id = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		
		System.out.println("평균점수: " + avgScore);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + id);
	}
}