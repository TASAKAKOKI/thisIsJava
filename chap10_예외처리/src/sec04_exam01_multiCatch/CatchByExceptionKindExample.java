package sec04_exam01_multiCatch;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �� �� �����ϴ�.");
			System.out.println("");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}