package sec02_�۾�������_������_����.exam01_createThread;

import java.awt.Toolkit;

public class BeepPrintExampl1 {
	public static void main(String[] args) {
		//��������  5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾��� ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(600);} catch(Exception e) {}
		}

		//"��" ���ڿ��� 5�� ����ϴ� �۾��� ����
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
		}
		
		/*���� ���� �ۼ��ϸ�, ���ν����常 �����ϹǷ�,
		 *�������� 0.6�� �������� 5�� �� �ڿ�, 0.6�� �������� "��"�̶�� ���ڿ��� ��µȴ�.
		 */
	}
}