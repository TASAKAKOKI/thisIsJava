package sec02_List�÷���.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList(
				"ȫ�浿",
				"���ڹ�",
				"���̽�"
		); //���� list�� ���� �� ������ ���� ��ü�� �߰�������, asList�� ������ ���ÿ� ������ ��ü��� ������ list�� ������ �� �ִ�. 
		// ���� ���� List<T>�� ����� Ÿ���Ķ���Ϳ� ���� Ÿ���� ��ü�� ������ �־��ְų�,
		// �Ʒ��� ���� Ÿ�� �Ķ���Ϳ� ���� Ÿ���� �迭�� �����Ͽ� �Ű������� �Ѱ��� ���� �ִ�.
		Integer[] integers = {1,2,3};
		List<Integer> list2 = Arrays.asList(integers);//asList�� �迭�� �Ű������� ������ ���� �ִ�. ��, Ÿ���Ķ���Ϳ� ������ Ÿ������ �̷��� �迭�̾�� �Ѵ�.
		
		for(String name : list1) {
			System.out.println(name);
		}
		for(Integer number : list2) {
			System.out.println(number);
		}
	}
}