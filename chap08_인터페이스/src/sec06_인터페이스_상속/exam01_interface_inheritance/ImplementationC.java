package sec06_인터페이스_상속.exam01_interface_inheritance;

public class ImplementationC implements InterfaceC {
	//하위 인터페이스 InterfaceC를 구현한 이 객체에는 InterfaceC의 추상메소드에 대한 실체메소드 뿐만 아니라, 
	//InterfaceC의 상위 인터페이스인 InterfaceA와 InterfaceB의 추상메소드에 대한 실체메소드도 있어야 한다.
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}	
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");		
	}	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}
