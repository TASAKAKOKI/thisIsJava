package sec11_ArraysŬ����.exam01_array_copy;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//���1: Arrays.copyOf(�迭, ������ ����) ���
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//���1: Arrays.copyOfRange(�迭, ���� ���� index(����), ���� �� index(����)) ���
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//���1: System.arraycopy(�����迭, ����index, Ÿ�ٹ迭, Ÿ�ٹ迭����index, ������ ����) ���
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		for(int  i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]= " + arr4[i]);
		}
				
	}
}