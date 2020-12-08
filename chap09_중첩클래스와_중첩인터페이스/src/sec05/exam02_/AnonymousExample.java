package sec05.exam02_;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명객체 필드를 사용
		anony.parentField.turnOn();
		anony.parentField.turnOff();
		System.out.println("====================");
		//익명객체 로컬변수를 사용
		anony.method1();
		System.out.println("====================");		
		//익명객체를 메소드의 매개값으로 사용
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("매개값으로 주어진 익명객체_RemoteControl()객체의 추상메소드를 재정의한 실체메소드 호출: SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("매개값으로 주어진 익명객체_RemoteControl()객체의 추상메소드를 재정의한 실체메소드 호출: SmartTV를 끕니다.");
			}
		});
	}
}