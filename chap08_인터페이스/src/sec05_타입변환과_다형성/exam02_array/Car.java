package sec05_타입변환과_다형성.exam02_array;

public class Car {
	Tire[] tires = {new HanTire(),new HanTire(),new HanTire(),new HanTire()};
	
	void run() {
		//축약형 for문을 사용하면 편리하다.
		for(Tire tire : tires) {
			tire.roll();			
		}
	}
}