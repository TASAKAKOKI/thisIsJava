package sec11_ArraysŬ����.exam02_equals;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] origin = {{1,2},{3,4}};
		
		//���� ���� Arrays.equals()�� �̿�: 1�� �׸��� ���� ���Ѵ�.
		System.out.println("[���� ���� �� ��]");
		int[][] clonedNotDeeply = Arrays.copyOf(origin, origin.length);
		System.out.println("�迭 ���� ��: " + origin.equals(clonedNotDeeply));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(origin,clonedNotDeeply));
		System.out.println("2�� �迭 �׸� ��: " + Arrays.deepEquals(origin,clonedNotDeeply));
		System.out.println();
		///���� ���� Arrays.deepEquals()�� �̿�: 1�� �׸��� ���� ���� �� ���� �ٸ� �迭�� �����ϰ� ���� ���, ��ø�� �迭�� �׸������ ���Ѵ�.
		System.out.println("[���� ���� �� ��]");
		int[][] clonedDeeply = Arrays.copyOf(origin, origin.length);
		clonedDeeply[0] = Arrays.copyOf(origin[0], origin[0].length);
		clonedDeeply[1] = Arrays.copyOf(origin[1], origin[1].length);
		System.out.println("�迭 ���� ��: " + origin.equals(clonedDeeply));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(origin,clonedDeeply));
		System.out.println("2�� �迭 �׸� ��: " + Arrays.deepEquals(origin,clonedDeeply));
		
	}
}