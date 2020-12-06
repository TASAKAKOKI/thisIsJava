package sec07.exam07_instanceOf;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	//method2는 instance확인을 해주지 않기 때문에 ClassCastException 예외가 발생할 가능성이 있다.
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		//아래의 두 메소드에서는 모두 Child객체를 매개값으로 전달하고 있으므로, 오류가 발생하지 않는다.
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		//아래의 두 메소드에서는 모두 Parent객체를 매개값으로 전달하고 있다.
		//따라서, instance검사를 하는 method1에서는 오류가 발생하지 않지만,
		//instance 검사를 하지 않는 method2에서는 ClassCastException 예외가 발생한다.
		method1(parentB);
		method2(parentB);//예외발생!!
	}

}
