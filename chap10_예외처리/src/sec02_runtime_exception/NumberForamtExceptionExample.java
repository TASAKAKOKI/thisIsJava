package sec02_runtime_exception;

public class NumberForamtExceptionExample {
	public static void main(String[] args) {
		System.out.println("���ڿ��� ������ ��ȯ�غ���");
		String data1 = "100";
		String data2 = "200";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println("��ȯ ����!");
		
		System.out.println("���ڿ��� �Ǽ��� ��ȯ�غ���");
		String data3 = "10.23";
		String data4 = "a10.234";
		
		double val3 = Double.parseDouble(data3);
		double val4 = Double.parseDouble(data4);
		System.out.println("��ȯ ����!");
	}
}