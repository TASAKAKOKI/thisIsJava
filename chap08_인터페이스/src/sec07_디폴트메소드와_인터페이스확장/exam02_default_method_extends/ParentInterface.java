package sec07_디폴트메소드와_인터페이스확장.exam02_default_method_extends;

public interface ParentInterface {
	void method1();
	default void method2() {
		System.out.println("ParentInterface-method2()실행");
	}
}
