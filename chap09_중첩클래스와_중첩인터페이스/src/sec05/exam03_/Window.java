package sec05.exam03_;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	
	//ButtonŬ���� ������ ��ø �������̽��� ���� ������ü��
	//Button.OnClickListenr Ÿ�� �ʵ带 �����ϰ� �װ��� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	Window() {
		//�Ű������� ���� �����ϰ� �ʱ�ȭ�� �ʵ带 ����	}
		button1.setOnClickListener(listener);
		
		//�Ű������� �ٷ� ButtonŬ���� ������ ��ø �������̽��� ���� ������ü�� �����Ѵ�.
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}