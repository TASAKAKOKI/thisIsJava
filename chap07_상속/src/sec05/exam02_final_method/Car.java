package sec05.exam02_final_method;

public class Car {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {speed++;}
	
	//final �޼ҵ� 
	//�Ʒ��� �޼ҵ�� final�� ����Ǿ����Ƿ� �ڽ� Ŭ�������� Overriding �� �� ����.
	public final void stop() {
		System.out.println("���� ����ϴ�.");
		speed = 0;
	}
}
