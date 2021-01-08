package sec08_StringTokenizer클래스;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박명수";
		StringTokenizer st = new StringTokenizer(text,"/");
		//StringTokenizer객체를 생성하기 위해서는 java.util.StringTokenizer 패키지를 import해주어야 한다.
		int countTokens = st.countTokens();
		System.out.println("총 토큰 수: " + countTokens);
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name + "남은 토큰 수: " + st.countTokens());
		}
	}
}