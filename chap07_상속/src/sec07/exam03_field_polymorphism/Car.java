package sec07.exam03_field_polymorphism;

public class Car {
	Tire FL_Tire = new Tire("�տ���",5);
	Tire FR_Tire = new Tire("�տ�����",10);
	Tire BL_Tire = new Tire("�ڿ���",7);
	Tire BR_Tire = new Tire("�ڿ�����",6);
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if(FL_Tire.roll()==false) {
			stop();
			return 1;
		}
		if(FR_Tire.roll()==false) {
			stop();
			return 2;
		}
		if(BL_Tire.roll()==false) {
			stop();
			return 3;
		}
		if(BR_Tire.roll()==false) {
			stop();
			return 4;
		}
		return  0;
	}
	void stop( ) {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}