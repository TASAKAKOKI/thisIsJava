package sec04.exam02_parent_method_call;

public class SupersonicAirplaneExample {

	public SupersonicAirplaneExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane ssa = new SupersonicAirplane();
		ssa.takeoff();
		ssa.fly();
		ssa.flymode = SupersonicAirplane.SUPERSONIC;
		ssa.fly();
		ssa.flymode = SupersonicAirplane.NORMAL;
		ssa.fly();
		ssa.land();
	}

}
