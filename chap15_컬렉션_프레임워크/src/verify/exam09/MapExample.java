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
		
		String id = null; //�ְ� ������ ���� ���̵� ����
		int maxScore = 0; //�ְ� ���� ����
		int totalScore = 0; //���� �հ� ����
		
		/*�ڵ� �ۼ�*/
		//�����---
		//�������: 91
		//�ְ�����: 96
		//�ְ������� ���� ���̵�: blue;
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet(); //Map.Entry���
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				id = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		
		System.out.println("�������: " + avgScore);
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�ְ������� ���� ���̵�: " + id);
	}
}