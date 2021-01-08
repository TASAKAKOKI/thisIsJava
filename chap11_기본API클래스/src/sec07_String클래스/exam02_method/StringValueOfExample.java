package sec07_String클래스.exam02_method;

/*문자열 변환(valueOf())
 * 	기본 타입의 값을 문자열로 변환
 * 	String클래스에서 제공하는 정적메소드		
 * 		static String valueOf(boolean b)
 * 		static String valueOf(char c)
 * 		static String valueOf(int i)
 * 		static String valueOf(double d)
 *		static String valueOf(long l)
 *		static String valueOf(float f) 
 */
public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);			//"10"로 저장
		String str2 = String.valueOf(10.5);			//"10.5"로 저장
		String str3 = String.valueOf(100000000);	//"10000000"로 저장
		String str4 = String.valueOf(true);			//"true"로 저장
		String str5 = String.valueOf('c');			//"c"로 저장
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}