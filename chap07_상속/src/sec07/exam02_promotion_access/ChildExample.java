package sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String args[]) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); // parent 클래스의 필드 및 메소드에만 접근할 수 있는데, child 클래스의 메소드인 method3은 호출 불가
	}
}
