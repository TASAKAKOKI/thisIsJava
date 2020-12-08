package sec04.exam01_nestedInterface;

public class Button {
	//�ν��Ͻ� �ʵ�: OnClickListener�������̽� Ÿ������ �ʵ带 ����; ���⿡�� ���� ������ü�� ���Ե� �� �ִ�.
	OnClickListener listener;
	
	//Setter �޼ҵ�
	//�� �޼ҵ�� OnClickListener�������̽��� ������ �پ��� ������ü�� �Ű������� �޾� ����Ѵ�.
	//�־��� �Ű����� ButtonŬ������ �ν��Ͻ� �ʵ� ������ �����Ѵ�.
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//�̺�Ʈ �߻�(touch()�̺�Ʈ)
	//Button��ü�� touch�޼ҵ尡 ȣ��Ǹ�, �ʵ� �������� listener������ü�� onClick() ��ü�޼ҵ带 ȣ���Ѵ�.
	void touch() {
		listener.onClick();
	}
	
	//OnClickListenr�������̽����� onClick()�߻�޼ҵ尡 ����Ǿ� �ְ�, �� ���� ��ü�� onClick() ��ü�޼ҵ尡 ���ǵǾ�� �Ѵ�.
	interface OnClickListener {
		void onClick();
	}
}