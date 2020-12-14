package sec11_Arrays클래스.exam01_array_copy;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//방법1: Arrays.copyOf(배열, 복사할 길이) 사용
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//방법1: Arrays.copyOfRange(배열, 복사 시작 index(포함), 복사 끝 index(제외)) 사용
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//방법1: System.arraycopy(원본배열, 시작index, 타겟배열, 타겟배열시직index, 복사할 길이) 사용
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		for(int  i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]= " + arr4[i]);
		}
				
	}
}