package sec05.exam02_;

public class Anonymous {
	//필드 초기값으로 익명자식객체 대입
	RemoteControl parentField = new RemoteControl() {
		/*익명객체 내에서는 RemoteControl 인터페이스에 정의된 모든 추상메소드를 재정의한 실체메소드를 선언하고 초기화 해주어야 한다.
		*/
		@Override
		public void turnOn() {
			System.out.println("익명객체 필드_인터페이스의 추상메소드의 실체메소드 turnOn() 호출");
		}
		@Override
		public void turnOff() {
			System.out.println("익명객체 필드_인터페이스의 추상메소드의 실체메소드 turnOff() 호출");			
		}
	};
	
	void method1() {
		//로컨 변수값으로 익명자식객체 대입
		RemoteControl parentLocalValue = new RemoteControl() {
			/*마찬가지로, 익명객체 내에서는 RemoteControl 인터페이스에 정의된 모든 추상메소드를 재정의한 실체메소드를 선언하고 초기화 해주어야 한다.
			*/
			@Override
			public void turnOn() {
				System.out.println("익명객체 로컬변수_인터페이스의 추상메소드의 실체메소드 turnOn() 호출");
			}
			@Override
			public void turnOff() {
				System.out.println("익명객체 로컬변수_인터페이스의 추상메소드의 실체메소드 turnOff() 호출");						
			}
		};
		//로컬 변수 사용
		parentLocalValue.turnOn();
		parentLocalValue.turnOff();
	}
	
	//메소드의 매개값으로 RemoteControl인터페이스를 구현한 구현객체를 줄 수 있는데, 이때에도 역시 익명객체를 생성하여 매개값으로 줄 수 있다.
	void method2(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
}