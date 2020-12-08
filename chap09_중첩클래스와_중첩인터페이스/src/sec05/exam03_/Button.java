package sec05.exam03_;

public class Button {
	//OnClickListener(�������̽�)Ÿ������ �ʵ�(listener)�� ����
	OnClickListener listener;
	
	//setOnClickListener(Setter�޼ҵ�)�� ���� �ܺο��� ������ü(OnClickListener listener)�� �Ű������� ���޹޾� �ʵ�(listener)�� ����
	//OnClickListener ������ü�� �Ű������� �޴� �޼ҵ� ����
	//�Ű������� �־��� ������ü�� �������̽� �ʵ忡 ����
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//Button �̺�Ʈ(touch())�� �߻����� ��, �������̽��� ���� ���� ��ü�� �޼ҵ带 ȣ��(listener.onClick())�Ѵ�.  
	//�ʵ忡 ���Ե� ������ü�� onClick() ��ü�޼ҵ带 ȣ���ϴ� �޼ҵ� ����
	void touch() {
		listener.onClick();		
	}
	//��ø �������̽� �����
	interface OnClickListener {
		void onClick();
	}
}