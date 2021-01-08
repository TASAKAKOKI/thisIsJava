package sec07_StringŬ����.exam02_method;

import java.io.UnsupportedEncodingException;

/* String ��ü�� ����Ʈ �迭�� ��ȯ�ϱ�
 * 	�ý����� �⺻ ���ڼ����� ���ڵ��� ����Ʈ �迭 ���
 * 		byte[] bytes = "���ڿ�".getBytes(); //String��ü�� getBytes()�� ȣ�����ش�.
 * 		�̷��� ����Ʈ �迭�� �ٲ� ���� �ٽ� ���ڿ��� ���ڵ� �Ϸ���,
 * 			String str = new String(byte[] bytes); //��ó��, ����Ʈ �迭�� String�����ڿ� �Ű������� �������ָ� �ȴ�.
 * 
 *	Ư�� ���ڼ����� ���ڵ��� ����Ʈ �迭 ���
 *		try {
 * 			byte[] bytes = "���ڿ�".getBytes("EUC-KR");
 * 			byte[] bytes = "���ڿ�".getBytes("UTF-8"); //�߸��� ���ڼ��� ���ԵǸ� Exception�߻�
 * 		} catch(UnsupportedEncodingException e) {
 * 		}
 * 		�̷��� �ڵ带 �ۼ��ϰ�, �̸� �ٽ� ���ڵ� �� ���,
 * 			String str = new String(byte[] bytes, String charsetName);
 * */
public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3,"EUC-KR");
			System.out.println("bytes3->String: " + str3); //Ư�� ���ڼ����� ����Ʈ�迭�� ������� ���ڿ��� �ٸ� ���ڼ����� ���ڵ��ϰ� �Ǹ� ���������� �Ͼ��.
			//byte[] bytes4 = str.getBytes("wrong charSet"); 
		} catch(UnsupportedEncodingException e) { //���ڼ��� �߸� ���� ������ �߻��Ѵ�.
			e.printStackTrace();
		}
	}
}