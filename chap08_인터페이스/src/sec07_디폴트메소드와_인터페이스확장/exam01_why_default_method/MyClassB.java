package sec07_디폴트메소드와_인터페이스확장.exam01_why_default_method;

public class MyClassB implements MyInterface{
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	//default메소드를 재정의 할 때는, default키워드는 제거 해준다.
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
}
