package sec07_StringŬ����.exam02_method;

/*���ڿ� ��ȯ(valueOf())
 * 	�⺻ Ÿ���� ���� ���ڿ��� ��ȯ
 * 	StringŬ�������� �����ϴ� �����޼ҵ�		
 * 		static String valueOf(boolean b)
 * 		static String valueOf(char c)
 * 		static String valueOf(int i)
 * 		static String valueOf(double d)
 *		static String valueOf(long l)
 *		static String valueOf(float f) 
 */
public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);			//"10"�� ����
		String str2 = String.valueOf(10.5);			//"10.5"�� ����
		String str3 = String.valueOf(100000000);	//"10000000"�� ����
		String str4 = String.valueOf(true);			//"true"�� ����
		String str5 = String.valueOf('c');			//"c"�� ����
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}