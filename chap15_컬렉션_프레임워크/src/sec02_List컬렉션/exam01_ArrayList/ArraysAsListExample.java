package sec02_List컬렉션.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList(
				"홍길동",
				"김자바",
				"파이썬"
		); //본래 list는 생성 후 삽입을 통해 객체를 추가하지만, asList로 생성과 동시에 고정된 객체들로 구성된 list를 생성할 수 있다. 
		// 위와 같이 List<T>에 선언된 타입파라미터와 같은 타입의 객체를 일일히 넣어주거나,
		// 아래와 같이 타입 파라미터와 같은 타입의 배열을 생성하여 매개값으로 넘겨줄 수도 있다.
		Integer[] integers = {1,2,3};
		List<Integer> list2 = Arrays.asList(integers);//asList에 배열을 매개값으로 전달할 수도 있다. 단, 타입파라미터와 동일한 타입으로 이뤄진 배열이어야 한다.
		
		for(String name : list1) {
			System.out.println(name);
		}
		for(Integer number : list2) {
			System.out.println(number);
		}
	}
}