package sec07.exam03_field_polymorphism;

public class HanTire extends Tire {
	public HanTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HanTire ¼ö¸í: " + (maxRotation-accumulatedRotation));
			return true;
		}
		System.out.println("*** " + location + " HanTire ÆãÅ©!! ***");
		return false;
	}	
}