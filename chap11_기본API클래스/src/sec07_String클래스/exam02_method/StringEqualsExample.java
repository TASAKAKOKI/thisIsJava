package sec07_StringŬ����.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("���ڹ�"); //new�� ���ο� ��ü�� �����Ѵ�.
		String strVar2 = "���ڹ�";
		String strVar3 = "���ڹ�"; //strVar2�� 3�� ���ڿ� ��ü�� ����
		
		compare(strVar1,strVar2); //strVar1==strVar2�� ����
		compare(strVar2,strVar3); //strVar2==strVar3�� ����
		
		equalTest(strVar1,strVar2); //strVar1.equals(strVar2)�� ����
		equalTest(strVar2,strVar3); //strVar2.equals(strVar3)�� ����
	}
	public static void compare(String str1, String str2) {
		if(str1 == str2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
	}
	public static void equalTest(String str1, String str2) {
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
	}
}