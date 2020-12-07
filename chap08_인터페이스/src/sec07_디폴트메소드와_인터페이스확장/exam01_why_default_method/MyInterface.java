package sec07_디폴트메소드와_인터페이스확장.exam01_why_default_method;

public interface MyInterface {
	//기존 추상메소드
	void method1();
	//추가하려는 새 추상메소드
	/*MyClassA는 기존의 MyInterface인터페이스를 구현하는 객체였으나,
	기존의 인터페이스에 새롭게 추상메소드를 추가하게되면,
	구현 객체들이 모두 에러가 난다. 
	이는 새롭게 정의된 추상메소드를 재정의 하지 않았기 때문인데,
	구현 객체가 많을 수록 이를 새로 수정하기에 애로사항이 생기게 된다.
	이를 위한 방법이 바로 default메소드를 만들어서,
	새로운 구현객체를 만들어 주는 것이다.
	void method2();
	*/
	 
	 //새로 추가하는 default 메소드: 반드시 실행블록{}이 필요하다.
	 default void method2() {
		 /*실행문:안적어도 무방*/
		 System.out.println("MyInterface-method2()실행");
	 };
	
}
