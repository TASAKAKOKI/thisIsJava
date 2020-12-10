package sec04_exam01_multiCatch;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + "+" + data2 + "=" + result);	
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			//java7���ʹ� multi catch ����� ����
			// | ��ȣ�� �Է��ϹǷν�, or ����� ������ �� �ִ�.
			System.out.println("���� �Ű����� ���� �����ϰų�, ���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		/* �Ʒ��� �� ���� �ڵ带 ���� �� �ٷ� ó���� �� �ִ�.
		 *catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����ϰų�, ���ڷ� ��ȯ�� �� �����ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���� �Ű����� ���� �����ϰų�, ���ڷ� ��ȯ�� �� �����ϴ�.");
		}
		 **/		
		catch(Exception e) {
			System.out.println("�ٸ� ���ܰ� �߻��߽��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}