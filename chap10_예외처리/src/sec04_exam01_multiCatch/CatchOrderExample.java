package sec04_exam01_multiCatch;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);	
			//����ó���� �������� �� ����, �ݵ�� ���� ���� Ŭ����ó���� �� �Ʒ����� �ؾ� �Ѵ�.
			//���� ���� Ŭ������ ���� ����Ŭ������ ����ϹǷ�, ���� ���� ó�� �ڵ尡 ���� ���� ��, �� ó���ڵ忡 �ɷ������� �����̴�.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch(Exception e) {
			System.out.println("�ٸ� ���ܰ� �߻��߽��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
