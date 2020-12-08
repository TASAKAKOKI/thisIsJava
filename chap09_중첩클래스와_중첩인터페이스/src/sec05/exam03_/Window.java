package sec05.exam03_;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	
	//Button클래스 내부의 중첩 인터페이스에 대한 구현객체를
	//Button.OnClickListenr 타입 필드를 선언하고 그곳에 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	Window() {
		//매개값으로 위에 선언하고 초기화한 필드를 대입	}
		button1.setOnClickListener(listener);
		
		//매개값으로 바로 Button클래스 내부의 중첩 인터페이스에 대한 구현객체를 대입한다.
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}