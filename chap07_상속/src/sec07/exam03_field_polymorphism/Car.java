package sec07.exam03_field_polymorphism;

public class Car {
	Tire FL_Tire = new Tire("앞왼쪽",5);
	Tire FR_Tire = new Tire("앞오른쪽",10);
	Tire BL_Tire = new Tire("뒤왼쪽",7);
	Tire BR_Tire = new Tire("뒤오른쪽",6);
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다]");
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
		System.out.println("[자동차가 멈춥니다.]");
	}
}