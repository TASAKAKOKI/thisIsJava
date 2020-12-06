package sec07.exam03_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		for(int i = 0; i <=5; i++) {
			int problemLocation = myCar.run();
			switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 HanTire로 교체");
					myCar.FL_Tire = new HanTire("앞왼쪽",8);
					break;
				case 2:
					System.out.println("앞 오른쪽 KumTire로 교체");
					myCar.FR_Tire = new KumTire("앞오른쪽",7);
					break;
				case 3:
					System.out.println("뒤 왼쪽 HanTire로 교체");
					myCar.BL_Tire = new HanTire("뒤왼쪽",5);
					break;
				case 4:
					System.out.println("뒤 오른쪽 KumTire로 교체");
					myCar.BR_Tire = new KumTire("뒤오른쪽",6);
					break;
				default:
					break;
			}
			System.out.println("-----run()완료-----"); 
		}
	}
}