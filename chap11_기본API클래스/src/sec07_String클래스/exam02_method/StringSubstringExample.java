package sec07_StringŬ����.exam02_method;

/* ���ڿ� �߶󳻱�(substring())
 * 	substring(int beginIndex, intendIndex)
 * 		�־��� ���۰� �� �ε��� ������ ���ڿ��� ���� (�� �ε��� ����x)
 * 	substring(int beginIndex)
 * 		�־��� �ε��� ���ĺ��� ������ ���ڿ��� ����
 */
public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}