package sec03_�������̽�_����.exam02_noname_implement_class;

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
			//���⿡ ����Ǵ� �޼ҵ�� �� {} ��� �ȿ����� ȣ�� �����ϴ�.
			// public void otherMethod() {/*���๮*/}
			
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
			//���⿡ ����Ǵ� �޼ҵ�� �� {} ��� �ȿ����� ȣ�� �����ϴ�.
			// public void otherMethod() {/*���๮*/}
			
		};
	}

}
 