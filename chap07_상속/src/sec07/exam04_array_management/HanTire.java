package sec07.exam04_array_management;

public class HanTire extends Tire {
	public HanTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HanTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		System.out.println("*** " + location + " HanTire ��ũ!! ***");
		return false;
	}	
}