package sec13_Math클래스.exam01_MathClass;

public class MathRandomExample {
	public static void main(String[] args) {
		int randomNum = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈: " + randomNum);
	}
}