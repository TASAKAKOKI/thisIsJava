package sec04_Map�÷���.exam01_hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<>();
		//var map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "ȫ�浿"), "����ü");
		map.put(new Student(1, "ȫ�浿"), "�İ�ü");
		
		System.out.println("�� Entry ��: " + map.size()); // StudentŬ�������� equals()�� hashCode()�� ������ �Ͽ� sno�� name�� ������ ���� ��ü�� ������ �����Ƿ�, ���� �ٸ� ��ü�� key�Ű������� map�� put�Ͽ��� �ߺ�Ű�� �ν��Ͽ�, 1���� ��ü�� ����ȴ�.
		
		System.out.println(map.get(new Student(1, "ȫ�浿"))); // �̶�, �������� put�� ��ü�� �����ϰ� ������ �� �� �ִ�.
	}
}