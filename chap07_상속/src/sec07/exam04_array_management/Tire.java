package sec07.exam04_array_management;

public class Tire {
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	public Tire(String location, int maxRotaion) {
		this.location = location;
		this.maxRotation = maxRotaion;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		System.out.println("*** " + location + " Tire 펑크!! ***");
		return false;
	}	
}