package verify.exam12;

public class StringConvertExample {
	public static void main(String[] args) {
		/* 문자열을 정수로 변환하기
		 * 숫자를 문자열로 변환하기
		 * */
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = Integer.toString(intData2);
		
		System.out.println(intData1);
		System.out.println(strData2);
	}
}