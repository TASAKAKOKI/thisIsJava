package verify.exam12;

public class StringConvertExample {
	public static void main(String[] args) {
		/* ���ڿ��� ������ ��ȯ�ϱ�
		 * ���ڸ� ���ڿ��� ��ȯ�ϱ�
		 * */
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = Integer.toString(intData2);
		
		System.out.println(intData1);
		System.out.println(strData2);
	}
}