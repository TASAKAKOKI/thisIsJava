package sec07.exam04_array_management;

public class KumTire extends Tire{
	public KumTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		System.out.println("*** " + location + " KumTire ��ũ!! ***");
		return false;
	}
}