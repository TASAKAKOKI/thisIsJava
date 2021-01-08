package sec07_String클래스.exam02_method;

import java.io.UnsupportedEncodingException;

/* String 객체를 바이트 배열로 변환하기
 * 	시스템의 기본 문자셋으로 인코딩된 바이트 배열 얻기
 * 		byte[] bytes = "문자열".getBytes(); //String객체에 getBytes()를 호출해준다.
 * 		이렇게 바이트 배열로 바꾼 것을 다시 문자열로 디코딩 하려면,
 * 			String str = new String(byte[] bytes); //이처럼, 바이트 배열을 String생성자에 매개값으로 전달해주면 된다.
 * 
 *	특정 문자셋으로 인코딩된 바이트 배열 얻기
 *		try {
 * 			byte[] bytes = "문자열".getBytes("EUC-KR");
 * 			byte[] bytes = "문자열".getBytes("UTF-8"); //잘못된 문자셋이 오게되면 Exception발생
 * 		} catch(UnsupportedEncodingException e) {
 * 		}
 * 		이렇게 코드를 작성하고, 이를 다시 디코딩 할 경우,
 * 			String str = new String(byte[] bytes, String charsetName);
 * */
public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3,"EUC-KR");
			System.out.println("bytes3->String: " + str3); //특정 문자셋으로 바이트배열로 만들어진 문자열을 다른 문자셋으로 디코딩하게 되면 깨짐현상이 일어난다.
			//byte[] bytes4 = str.getBytes("wrong charSet"); 
		} catch(UnsupportedEncodingException e) { //문자셋이 잘못 오면 오류가 발생한다.
			e.printStackTrace();
		}
	}
}