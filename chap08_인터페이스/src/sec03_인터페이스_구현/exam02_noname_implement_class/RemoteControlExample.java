package sec03_인터페이스_구현.exam02_noname_implement_class;

public interface RemoteControlExample {
	public static void main(String args[]) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("");
			}
			@Override
			public void turnOff() {
				System.out.println("");				
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("");
			}
			//여기에 선언되는 메소드는 이 {} 블록 안에서만 호출 가능하다.
			// public void otherMethod() {/*실행문*/}
			
		};
		RemoteControl rc1 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("");
			}
			@Override
			public void turnOff() {
				System.out.println("");				
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("");
			}
			//여기에 선언되는 메소드는 이 {} 블록 안에서만 호출 가능하다.
			// public void otherMethod() {/*실행문*/}
			
		};
	}

}
 