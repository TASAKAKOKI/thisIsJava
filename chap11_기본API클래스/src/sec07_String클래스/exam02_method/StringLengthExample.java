package sec07_StringŬ����.exam02_method;
/*
 *���ڿ� ����(length())
 *	���ڿ��� ���̸� ����
 */
public class StringLengthExample {
	public static void main(String[] args) {
		String ssn1 = "7645321245326";
		String ssn2 = "76452421365687";
		testNumber(ssn1);
		testNumber(ssn2);
	}
	public static void testNumber(String str){
		System.out.println("�ֹι�ȣ �ڸ���: " + str.length());
		int length = str.length(); //���ڿ��� ����(int)�� ��ȯ

		if(length==13) {
			System.out.println("�ֹι�ȣ�� �ڸ����� 13���� �½��ϴ�.");
		} else {
			System.out.println("�ֹι�ȣ�� �ڸ����� 13���� �ƴմϴ�.");
		}
	}
}