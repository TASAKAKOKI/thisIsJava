package sec07.exam03_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		for(int i = 0; i <=5; i++) {
			int problemLocation = myCar.run();
			switch(problemLocation) {
				case 1:
					System.out.println("�� ���� HanTire�� ��ü");
					myCar.FL_Tire = new HanTire("�տ���",8);
					break;
				case 2:
					System.out.println("�� ������ KumTire�� ��ü");
					myCar.FR_Tire = new KumTire("�տ�����",7);
					break;
				case 3:
					System.out.println("�� ���� HanTire�� ��ü");
					myCar.BL_Tire = new HanTire("�ڿ���",5);
					break;
				case 4:
					System.out.println("�� ������ KumTire�� ��ü");
					myCar.BR_Tire = new KumTire("�ڿ�����",6);
					break;
				default:
					break;
			}
			System.out.println("-----run()�Ϸ�-----"); 
		}
	}
}