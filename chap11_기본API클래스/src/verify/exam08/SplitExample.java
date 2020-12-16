package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법 1 split()메소드를 이용하여 문자열 분리하기.
		String[] strs = str.split(",");
		for(String string : strs) {
			System.out.println(string);			
		}
		System.out.println();
		
		//방법 2 StringTokenizer을 이용하여 문자열 분리하기.
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			//방법1: StringTokenizer(문자열)생성자 이용시,
			String token = st.nextToken();
			System.out.println(token);
			//방법2: StringTokenizer(문자열,구분자)생성자 이용시,
			//System.out.println(st.nextToken(","));
		}
	}
}