package sec04.exam01_nestedInterface;

public class ButtonExample {
	public static void main(String args[]) {
		Button btn = new Button();
		
		//��� 1: ������ü ���� ��, �Ű������� ����
		CallListener cl = new CallListener();
		MessageListener ml = new MessageListener();
		btn.setOnClickListener(cl);
		btn.touch();
		btn.setOnClickListener(ml);
		btn.touch();
		System.out.println("============");
		
		//���2: �Ű������� ������ ȣ��
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		System.out.println("============");
		
		//���3: �Ű������� �͸�ü ����
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
			}
		});
		btn.touch();
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("���ο� ������ ��ư�� ���Ƚ��ϴ�.");
			}
		});
		btn.touch();
	}
}