package sec07.exam03_field_polymorphism;

public class KumTire extends Tire{
	public KumTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumTire ����: " + (maxRotation-accumulatedRotation));
			return true;
		}
		System.out.println("*** " + location + " KumTire ��ũ!! ***");
		return false;
	}
}