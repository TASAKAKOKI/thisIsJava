package sec03_�ܼ�Console_�����.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		for(byte b=48; b<58; b++) {
			//48�� �ƽ�Ű �ڵ�� 0�̸�, 57�� 9�̴�.
			os.write(b);
		}
		
		os.write(13);
		//System.out.println();�� ���� ����
		//13�� �ƽ�Ű�ڵ�� ĳ��������(/r)�̴�.
		for(byte b=97; b<123; b++) {
			//97�� �ƽ�Ű�ڵ�� a�̸�, 122�� z�̴�.
			os.write(b);
		}
		os.write(13);
		for(byte b=65; b<91; b++) {
			//65�� �ƽ�Ű�ڵ�� A�̸�, 91�� Z�̴�.
			os.write(b);
		}

		os.write(13);
		//�ѱ��� ����ϴ� ��
		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();

		
	}
}