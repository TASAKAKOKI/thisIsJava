package sec07.exam04_array_management;

public class Tire {
	public int maxRotation; //�ִ� ȸ����
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	public Tire(String location, int maxRotaion) {
		this.location = location;
		this.maxRotation = maxRotaion;
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}
		System.out.println("*** " + location + " Tire ��ũ!! ***");
		return false;
	}	
}