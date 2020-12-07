package sec07_디폴트메소드와_인터페이스확장.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	//이 인터페이스는 ParentInterface의 default메소드를 재정의 하여 사용
	@Override
	default void method2() {
		System.out.println("ChildInterface-method2() 실행");
	}
	//ChildInterface2만의 추상메소드 선언
	void method3();
}
