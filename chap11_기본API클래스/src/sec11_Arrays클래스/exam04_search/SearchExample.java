package sec11_Arrays클래스.exam04_search;

import java.util.Arrays;

import sec11_Arrays클래스.exam03_array_sort.Member;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		
		//binarySearch를 할때에는 배열을 우선 정렬(sort())한 상태여야 한다.
		int index1 = Arrays.binarySearch(scores, 97);
		System.out.println("binarySearch로 찾은 인덱스: " + index1);
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		int index2 = Arrays.binarySearch(names, "홍길동");
		System.out.println("binarySearch로 찾은 인덱스: " + index2);
		
		Member m1 = new Member("김나래");
		Member m2 = new Member("홍길동");
		Member m3 = new Member("김민수");
		Member m4 = new Member("James");
		
		Member[] members = {m1,m2,m3,m4};
		Arrays.sort(members);
		int index3 = Arrays.binarySearch(members, m1);
		System.out.println("binarySearch로 찾은 인덱스: " + index3);
	}
}