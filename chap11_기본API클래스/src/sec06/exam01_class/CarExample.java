package sec06.exam01_class;

public class CarExample {
	public static void main(String[] args) {
		//Object클래스의 getClass()메소드는 해당클래스로 객체를 생성한 뒤에 사용가능하다.
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println("clazz1의 클래스 전체이름(패키지포함): 	" + clazz1.getName());
		System.out.println("clazz1의 클래스 이름(simple): 	" + clazz1.getSimpleName());
		System.out.println("clazz1의 클래스가 포함된 패키지 이름: 	" + clazz1.getPackage().getName());
		System.out.println();
		
		//forName()메소드는 Class클래스의 private처리된 생성자로의 접근이 불가한 것을 대체하기 위한, 정적메소드로서 getClass()와 같은 역할을 하지만, 객체생성을 필요로 하지는 않는다.
		//다만, 매개값으로 주어진 문자열을 이름으로 하는 클래스가 없는 경우 ClassNotFoundException을 발생시키므로, try-catch구문 안에서 사용되어야 한다.
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println("clazz2의 클래스 전체이름(패키지포함): 	" + clazz2.getName());
			System.out.println("clazz2의 클래스 이름(simple): 	" + clazz2.getSimpleName());
			System.out.println("clazz2의 클래스가 포함된 패키지 이름: 	" + clazz2.getPackage().getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}