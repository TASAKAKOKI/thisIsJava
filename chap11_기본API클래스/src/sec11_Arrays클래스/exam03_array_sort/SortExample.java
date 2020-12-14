package sec11_Arrays≈¨∑°Ω∫.exam03_array_sort;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		/*
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]);
			if(i != scores.length -1) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
		*/
		
		String[] names = {"»´±Êµø", "±ËπŒºˆ", "±Ë≥™∑°", "James", "JAmes"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Member m1 = new Member("±Ë≥™∑°");
		Member m2 = new Member("»´±Êµø");
		Member m3 = new Member("±ËπŒºˆ");
		Member m4 = new Member("James");
		
		Member[] members = {m1,m2,m3,m4};
		Arrays.sort(members);
		for(Member member : members) {
			System.out.println(member.name);
		}
		System.out.println(Arrays.toString(members));
		
	}
}