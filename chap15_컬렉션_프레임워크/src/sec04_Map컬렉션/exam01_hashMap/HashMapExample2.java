package sec04_Map컬렉션.exam01_hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<>();
		//var map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), "전객체");
		map.put(new Student(1, "홍길동"), "후객체");
		
		System.out.println("총 Entry 수: " + map.size()); // Student클래스에세 equals()와 hashCode()를 재정의 하여 sno와 name이 같으면 같은 객체로 여기기로 했으므로, 서로 다른 객체를 key매개값으로 map에 put하여도 중복키로 인식하여, 1개의 객체만 저장된다.
		
		System.out.println(map.get(new Student(1, "홍길동"))); // 이때, 마지막에 put한 객체를 저장하고 있음을 알 수 있다.
	}
}