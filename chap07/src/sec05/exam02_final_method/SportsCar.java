package sec05.exam02_final_method;

public class SportsCar extends Car {
	//�Ϲ������� ����� �޼ҵ�� ������(Override) �� �� �ִ�.
	@Override
	public void speedUp() {speed += 10;}
	
	//�θ� Ŭ�������� final�� ����� �޼ҵ�� �̰� �ڽ� Ŭ�������� �缱�� �� �� ����.
	@Override
	public void stop() {
		System.out.println("������ī�� ���ߴ� �޼ҵ带 �������ϰ� ������, ������ �� �� ����");
		speed = 0;
	}
	
}
