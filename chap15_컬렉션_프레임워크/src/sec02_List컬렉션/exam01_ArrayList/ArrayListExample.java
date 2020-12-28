package sec02_List컬렉션.exam01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List컬렉션 생성, ArrayList구현 클래스로 생성, default list size는 10이다.
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add(2, "Database"); //index 2번 위치에 저장되어 있던 Servelt/JSP위치에 Database를 저장하고, Servelt/JSP부터는 뒤로 한칸씩 움직이낟.
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("저장되어 있는 총 객체 수: " + list);
		System.out.println();
		
		String obj = list.get(2); //인데스 2위치에 있는 객체를 리턴
		System.out.println("2번 위치의 객체: " + obj);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		list.remove(2); //2번 위치의 객체를 삭제, 그 뒤의 객체들은 한칸씩 앞으로 이동
		list.remove("iBATIS"); //iBATIS 객체를 삭제
		//향상된 for문을 이용하여 list를 루프하기
		int i = 0;
		for(String str : list) {
			System.out.println(i + ": " + str);
			i++;
		}
	}
}