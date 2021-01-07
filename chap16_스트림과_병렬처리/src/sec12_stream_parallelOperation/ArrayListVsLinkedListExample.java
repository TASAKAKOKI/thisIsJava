package sec12_stream_parallelOperation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {
	//��� ó��
	public static void work(int value) {
	}
	
	//����ó��
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	public static void main(String[] args) {
		//�ҽ��÷���
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		for(int i=0;i<10000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		//���־�
		long arrayListParallel = testParallel(arrayList);
		long linkedListParallel = testParallel(linkedList);
		
		//���� ��Ʈ�� ó�� �ð� ���ϱ�
		arrayListParallel = testParallel(arrayList);
		linkedListParallel = testParallel(linkedList);
		
		if(arrayListParallel < linkedListParallel) {
			System.out.println("���� �׽�Ʈ ���: ArrayList ó���� �� ����");
		} else {
			System.out.println("���� �׽�Ʈ ���: LinkedList ó���� �� ����");
		}
		System.out.println("ArrayList ó�� �ҿ�ð�: " + arrayListParallel/100000 + "ms");
		System.out.println("LinkedList ó�� �ҿ�ð�: " + linkedListParallel/100000 + "ms");
		System.out.println("ArrayList ó�� �ҿ�ð�: " + arrayListParallel + "ns");
		System.out.println("LinkedList ó�� �ҿ�ð�: " + linkedListParallel + "ns");
	}
}