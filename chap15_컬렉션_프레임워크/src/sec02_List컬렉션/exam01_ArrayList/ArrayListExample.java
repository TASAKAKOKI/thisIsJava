package sec02_List�÷���.exam01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List�÷��� ����, ArrayList���� Ŭ������ ����, default list size�� 10�̴�.
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add(2, "Database"); //index 2�� ��ġ�� ����Ǿ� �ִ� Servelt/JSP��ġ�� Database�� �����ϰ�, Servelt/JSP���ʹ� �ڷ� ��ĭ�� �����̳�.
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("����Ǿ� �ִ� �� ��ü ��: " + list);
		System.out.println();
		
		String obj = list.get(2); //�ε��� 2��ġ�� �ִ� ��ü�� ����
		System.out.println("2�� ��ġ�� ��ü: " + obj);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		list.remove(2); //2�� ��ġ�� ��ü�� ����, �� ���� ��ü���� ��ĭ�� ������ �̵�
		list.remove("iBATIS"); //iBATIS ��ü�� ����
		//���� for���� �̿��Ͽ� list�� �����ϱ�
		int i = 0;
		for(String str : list) {
			System.out.println(i + ": " + str);
			i++;
		}
	}
}