package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Blue");
		Member m2 = new Member("Blue");
		Member m3 = new Member("Red");
		
		//본래 Object의 equals()메소드는 기본타입의 경우에는 값을 비교하고, 참조타입의 경우 참조하고 있는 주소가 같은지, 즉, 같은 객체인지를 비교하는 것인데,
		//Member클래스에서 equals()를 재정의 해주었기 때문에, 다른 객체를 참조하고 있는 m1과 m2가 같은 id값을 가지므로, 논리적으로 동등하다고 출력된다.
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다.");
		} else {
			System.out.println("m1과 m2는 동등하지 않습니다.");
		}
		
		if(m1 == m3) {
			System.out.println("m1과 m3는 동등합니다.");
		} else {
			System.out.println("m1과 m3는 동등하지 않습니다.");
		}
	}
}