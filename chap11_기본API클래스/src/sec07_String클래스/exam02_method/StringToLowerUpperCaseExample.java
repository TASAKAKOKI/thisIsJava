package sec07_StringŬ����.exam02_method;

/*���ĺ� �ҹ���/�빮�� ����(toLowerCase(), toUpperCase())
 * 	�ѱ��� �ش�x, ���ڿ��� ��� ���ڸ� �ҹ���/�빮�ڷ� �����Ͽ� ���ο� ���ڿ� ����
 */
public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		String str3 = "java programming";
		//java���� �ҹ��ڿ� �빮�ڸ� ���� �ٸ� ������ ����.
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		
		String lowerStr1 = str1.toLowerCase();
		String upperStr1 = str1.toUpperCase();
		System.out.println("upperStr1.equals(str2): " + upperStr1.equals(str2));
		System.out.println("lowerStr1.equals(str3): " + lowerStr1.equals(str3));
	}
}