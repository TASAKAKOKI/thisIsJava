package sec11_Arrays클래스.exam02_equals;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] origin = {{1,2},{3,4}};
		
		//얕은 복사 Arrays.equals()를 이용: 1차 항목의 값만 비교한다.
		System.out.println("[얕은 복사 후 비교]");
		int[][] clonedNotDeeply = Arrays.copyOf(origin, origin.length);
		System.out.println("배열 번지 비교: " + origin.equals(clonedNotDeeply));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(origin,clonedNotDeeply));
		System.out.println("2차 배열 항목값 비교: " + Arrays.deepEquals(origin,clonedNotDeeply));
		System.out.println();
		///깊은 복사 Arrays.deepEquals()를 이용: 1차 항목의 값만 비교한 후 서로 다른 배열을 참조하고 있을 경우, 중첩된 배열의 항목까지도 비교한다.
		System.out.println("[얕은 복사 후 비교]");
		int[][] clonedDeeply = Arrays.copyOf(origin, origin.length);
		clonedDeeply[0] = Arrays.copyOf(origin[0], origin[0].length);
		clonedDeeply[1] = Arrays.copyOf(origin[1], origin[1].length);
		System.out.println("배열 번지 비교: " + origin.equals(clonedDeeply));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(origin,clonedDeeply));
		System.out.println("2차 배열 항목값 비교: " + Arrays.deepEquals(origin,clonedDeeply));
		
	}
}