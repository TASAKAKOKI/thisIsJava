package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//�־��� args�� 2���� �ƴϸ� ArrayIndexOutOfBoundsException�� �߻��ϹǷ�,
		//if������ ó�����ش�.
		if(args.length ==2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);			
		} else {
			//args�� 2�� ���� �ʾ��� ���,
			//����ڿ��� args�� �ִ� ����� �ȳ��Ѵ�.
			System.out.println("[������]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample ��1 ��2");
		}
	}
}