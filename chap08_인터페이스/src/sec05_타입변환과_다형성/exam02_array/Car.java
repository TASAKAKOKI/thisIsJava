package sec05_Ÿ�Ժ�ȯ��_������.exam02_array;

public class Car {
	Tire[] tires = {new HanTire(),new HanTire(),new HanTire(),new HanTire()};
	
	void run() {
		//����� for���� ����ϸ� ���ϴ�.
		for(Tire tire : tires) {
			tire.roll();			
		}
	}
}