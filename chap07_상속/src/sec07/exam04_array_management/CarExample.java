package sec07.exam04_array_management;

public class CarExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		for(int i = 0; i <=10; i++) {
			int problemLocation = myCar.run();
			if(problemLocation != 0) {
				if(problemLocation % 2 == 0) {
					System.out.println(myCar.tires[problemLocation-1].location + " HanTire로 교체");
					myCar.tires[problemLocation-1] =
							new HanTire(myCar.tires[problemLocation-1].location,7);					
				} else {
					System.out.println(myCar.tires[problemLocation-1].location + " KumTire로 교체");
					myCar.tires[problemLocation-1] =
							new KumTire(myCar.tires[problemLocation-1].location,8);
				}
			}
			System.out.println("-----run()완료-----"); 
		}
	}
}