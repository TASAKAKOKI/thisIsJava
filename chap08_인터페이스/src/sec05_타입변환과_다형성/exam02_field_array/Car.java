package sec05_Ÿ�Ժ�ȯ��_������.exam02_field_array;

public class Car {
	//�ʵ�Ÿ���� Tire���ͺ��̽�Ÿ���� �迭�� �������ش�.
	Tire[] tires = {new HanTire(),new HanTire(),new HanTire(),new HanTire()};
	
	void run() {
		//����� for���� ����ϸ� ���ϴ�.
		for(Tire tire : tires) {
			tire.roll();			
		}
	}
}