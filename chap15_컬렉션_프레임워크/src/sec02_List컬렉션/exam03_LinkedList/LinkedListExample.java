package sec02_List�÷���.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		var list2 = new LinkedList<String>(); //java10 ���� ���Ӱ� �߰��� var Ű���带 ����Ͽ���. �ݺ��Ǵ� <>()�ڵ带 �ٿ��ִ� ȿ��
		
		long startTime;
		long endTime;
		
		/*ArrayList�� LinkedList�� �̿��Ͽ� for���� �����Ͽ�, list�� �� �տ� ��Ҹ� �߰��ϴ� �۾��� �Ͽ� ����ð��� ���غ��� */		
			//ArrayList�� �ҿ�ð�
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list1.add(0,String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("ArrayList�� �ɸ� �ð�: \t" + (endTime - startTime) + "ns");
			
			//LinkedList�� �ҿ� �ð�
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list2.add(0,String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("LinkedList�� �ɸ� �ð�: \t" + (endTime - startTime) + "ns");
		
		/*ArrayList�� LinkedList�� �̿��Ͽ� for���� �����Ͽ�, list�� �� �ڿ� ��Ҹ� �߰��ϴ� �۾��� �Ͽ� ����ð��� ���غ��� */		
			//ArrayList�� �ҿ�ð�
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list1.add(String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("ArrayList�� �ɸ� �ð�: \t" + (endTime - startTime) + "ns");
			
			//LinkedList�� �ҿ� �ð�
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list2.add(String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("LinkedList�� �ɸ� �ð�: \t" + (endTime - startTime) + "ns");
	}
}