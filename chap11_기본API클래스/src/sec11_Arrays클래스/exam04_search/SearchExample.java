package sec11_ArraysŬ����.exam04_search;

import java.util.Arrays;

import sec11_ArraysŬ����.exam03_array_sort.Member;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		
		//binarySearch�� �Ҷ����� �迭�� �켱 ����(sort())�� ���¿��� �Ѵ�.
		int index1 = Arrays.binarySearch(scores, 97);
		System.out.println("binarySearch�� ã�� �ε���: " + index1);
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		int index2 = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("binarySearch�� ã�� �ε���: " + index2);
		
		Member m1 = new Member("�質��");
		Member m2 = new Member("ȫ�浿");
		Member m3 = new Member("��μ�");
		Member m4 = new Member("James");
		
		Member[] members = {m1,m2,m3,m4};
		Arrays.sort(members);
		int index3 = Arrays.binarySearch(members, m1);
		System.out.println("binarySearch�� ã�� �ε���: " + index3);
	}
}